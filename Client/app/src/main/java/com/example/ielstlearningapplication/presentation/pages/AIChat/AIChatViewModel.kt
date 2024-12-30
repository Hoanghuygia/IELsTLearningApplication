package com.example.ielstlearningapplication.presentation.pages.AIChat

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.domain.usecase.aichat.AIChatUseCase
//import com.example.ielstlearningapplication.presentation.pages.AIChat.data.Message
import com.example.ielstlearningapplication.presentation.pages.AIChat.models.AIChatUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.example.ielstlearningapplication.domain.models.Message

@HiltViewModel
class AIChatViewModel @Inject constructor(
    private val aichatUseCase: AIChatUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(AIChatUIState())
    val uiState: StateFlow<AIChatUIState> = _uiState.asStateFlow()

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

    fun updateCurrentChat(newMessage: String) {
        _uiState.update { currentState ->
            currentState.copy(
                messages = currentState.messages + Message(
                    content = newMessage,
                    entity = 1,
                    timestamp = "12:33",
                )
            )
        }
    }

    fun sendMessage(content: String, userId: String, chatId: String) {
        viewModelScope.launch {
            try {
                aichatUseCase.sendMessage(content, userId, chatId)
                    .onSuccess { response ->
                    }
                    .onFailure { exception ->
                        _uiState.update { it.copy(
                            error = exception.message ?: "Failed to send message"
                        ) }
                    }
            } catch (e: Exception) {
                _uiState.update { it.copy(
                    error = e.message ?: "Unknown error occurred"
                ) }
            }
        }
    }



    fun clearEnterTextField() {
        _uiState.update { currentState ->
            currentState.copy(valueTextField = "")
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
