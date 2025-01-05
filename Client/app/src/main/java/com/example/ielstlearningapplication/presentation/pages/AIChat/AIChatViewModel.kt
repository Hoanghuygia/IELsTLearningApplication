package com.example.ielstlearningapplication.presentation.pages.AIChat

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.domain.models.Message
import com.example.ielstlearningapplication.domain.usecase.aichat.AIChatUseCase
import com.example.ielstlearningapplication.domain.usecase.app.AppUseCases
import com.example.ielstlearningapplication.presentation.pages.AIChat.models.AIChatUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import java.util.Calendar

@HiltViewModel
class AIChatViewModel @Inject constructor(
    private val aichatUseCase: AIChatUseCase,
    private val appUseCases: AppUseCases
) : ViewModel() {
    private val _uiState = MutableStateFlow(AIChatUIState())
    val uiState: StateFlow<AIChatUIState> = _uiState.asStateFlow()

    init {
        Log.d("Init ai chat view model", "huy")
        viewModelScope.launch {
            appUseCases.readAppInformation()
                .collect { userId ->
                    _uiState.update { currentState ->
                        currentState.copy(userId = userId)
                    }
                }
        }
    }

    /*
    In this function we need
        1. Save message in database
        2. Update in the current message
        3. Send to Gemini and then get response
        4. Render in current chat
     */
    fun sendMessage(content: String, userId: String, chatId: String) {
        saveMessageInDB(content = content, userId = userId, chatId = chatId, entity = 1)
        sendToGeminiAndGetMessageResponse(content = content, userId = userId, chatId = chatId)
    }

    fun sendToGeminiAndGetMessageResponse(content: String, userId: String, chatId: String) {
        viewModelScope.launch {
            try {
                val response = aichatUseCase.sendMessageToGemini(content)
                Log.d("Message from Gemini", "Gemini$response")

                response.onSuccess { chatResponse ->
                    saveMessageInDB(chatResponse.message, userId = userId, chatId = chatId, 0)
                    updateCurrentChat(newMessage = chatResponse.message, entity = 0)
                    updateStateLoading()
                }.onFailure { exception ->
                    _uiState.update { currentState ->
                        currentState.copy(
                            error = exception.message ?: "Unknown error",
                            isLoading = false
                        )
                    }
                }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        error = e.message ?: "Can't send message to Gemini"
                    )
                }
            }
        }
    }

    fun saveMessageInDB(content: String, userId: String, chatId: String, entity: Int) {
        viewModelScope.launch {
            try {
                aichatUseCase.sendMessage(content, userId, chatId, entity.toString())
                    .onSuccess { response ->
                    }
                    .onFailure { exception ->
                        _uiState.update {
                            it.copy(
                                error = exception.message ?: "Failed to send message"
                            )
                        }
                    }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        error = e.message ?: "Unknown error occurred"
                    )
                }
            }
        }
    }

    fun getMessages(id: String) {
        viewModelScope.launch {
            try {
                val response = aichatUseCase.getMessage(id)
                Log.d("getMessages", "Response: $response")

                response.onSuccess { chatResponse ->
                    _uiState.update { currentState ->
                        currentState.copy(
                            messages = chatResponse.data.chats[currentState.currentChat].messages,
                            isLoading = false,
                            chatLabel = chatResponse.data.chats[currentState.currentChat].label
                        )
                    }
                }.onFailure { exception ->
                    _uiState.update { currentState ->
                        currentState.copy(
                            error = exception.message ?: "Unknown error",
                            isLoading = false
                        )
                    }
                }
            } catch (e: Exception) {
                _uiState.update { currentState ->
                    currentState.copy(
                        error = e.message ?: "Unknown error",
                        isLoading = false
                    )
                }
                e.printStackTrace()
            }
        }
    }

    fun updateCurrentChat(newMessage: String, entity: Int) {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        _uiState.update { currentState ->
            currentState.copy(
                messages = currentState.messages + Message(
                    content = newMessage,
                    entity = entity,
                    timestamp = "$hour: $minute",
                )
            )
        }
    }

    fun clearEnterTextField() {
        _uiState.update { currentState ->
            currentState.copy(valueTextField = "")
        }
    }

    fun updateStateLoading() {
        _uiState.update { currentState ->
            currentState.copy(
                isLoading = !currentState.isLoading
            )

        }
    }

    fun updateEnterTextField(enterTextFieldValue: String) {
        _uiState.update { currentState ->
            currentState.copy(
                valueTextField = enterTextFieldValue,
            )
        }
    }
}
