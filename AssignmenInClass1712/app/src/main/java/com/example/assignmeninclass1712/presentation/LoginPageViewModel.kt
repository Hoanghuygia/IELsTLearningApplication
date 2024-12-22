package com.example.assignmeninclass1712.presentation

import androidx.lifecycle.ViewModel
import com.example.assignmeninclass1712.data.PageRoute
import com.example.assignmeninclass1712.data.UiAppState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class LoginPageViewModel: ViewModel() {
    private  val _uiState = MutableStateFlow(UiAppState())
    val uiState: StateFlow<UiAppState> = _uiState

    fun updateRoute(route: PageRoute){
        _uiState.update { currentState ->
            currentState.copy(currentPage = route)
        }
    }
}