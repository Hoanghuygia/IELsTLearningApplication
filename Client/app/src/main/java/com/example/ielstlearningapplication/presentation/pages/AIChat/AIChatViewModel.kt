package com.example.ielstlearningapplication.presentation.pages.AIChat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.data.remote.dto.ChatResponse
import com.example.ielstlearningapplication.domain.usecase.aichat.AIChatUseCase
import com.example.ielstlearningapplication.presentation.pages.AIChat.data.Message
import com.example.ielstlearningapplication.presentation.pages.AIChat.models.AIChatUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

//@HiltViewModel
//class AIChatViewModel @Inject constructor(private val aichatUseCase: AIChatUseCase) : ViewModel() {
//    private val _uiState = MutableStateFlow(AIChatUIState())
//    val uiState: StateFlow<AIChatUIState> = _uiState.asStateFlow()
//
//    var chatState by mutableStateOf(ChatResponse(success = false, data = emptyList()))
//        private set
//
//    fun fetchChats(id: String) {
//        viewModelScope.launch {
//            try {
//                val response = aichatUseCase.getMessage(id)
//                chatState = response
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
//        }
//    }
//
//    fun updateCurrentChat(newMessage: String) {
//        _uiState.update { currentState ->
//            currentState.copy(
//                currentChat = currentState.currentChat + Message(
//                    message = newMessage,
//                    time = "12:33",
//                    entity = 1
//                )
//            )
//        }
//    }
//
//    fun clearEnterTextField() {
//        _uiState.update { currentState ->
//            currentState.copy(valueTextField = "")
//        }
//    }
//
//    fun updateEnterTextField(enterTextFieldValue: String) {
////        _uiState.value = _uiState.value.copy(valueTextField = enterTextFieldValue)
//        _uiState.update { currentState ->
//            currentState.copy(
//                valueTextField = enterTextFieldValue,
//            )
//        }
//    }
//}

class AIChatViewModel(private val aichatUseCase: AIChatUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(AIChatUIState())
    val uiState: StateFlow<AIChatUIState> = _uiState.asStateFlow()

    var chatState by mutableStateOf(ChatResponse(success = false, data = emptyList()))
        private set

    fun fetchChats(id: String) {
        viewModelScope.launch {
            try {
                val response = aichatUseCase.getMessage(id)
                chatState = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun updateCurrentChat(newMessage: String) {
        _uiState.update { currentState ->
            currentState.copy(
                currentChat = currentState.currentChat + Message(
                    message = newMessage,
                    time = "12:33",
                    entity = 1
                )
            )
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
