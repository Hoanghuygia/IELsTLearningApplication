package com.example.ielstlearningapplication.presentation.pages.AIChat

import androidx.lifecycle.ViewModel
import com.example.ielstlearningapplication.presentation.pages.AIChat.models.AIChatUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AIChatViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(AIChatUIState())
    val uiState: StateFlow<AIChatUIState> = _uiState.asStateFlow()

    fun updateEnterTextField(enterTextFieldValue: String) {
//        _uiState.value = _uiState.value.copy(valueTextField = enterTextFieldValue)
        _uiState.update { currentState ->
            currentState.copy(
                valueTextField = enterTextFieldValue,
            )
        }
    }
}