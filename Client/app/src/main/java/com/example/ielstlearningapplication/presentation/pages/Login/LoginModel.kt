package com.example.ielstlearningapplication.presentation.pages.Login
//
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.domain.usecase.app.AppUseCases
import com.example.ielstlearningapplication.domain.usecase.user.UserUseCase
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginModel @Inject constructor(
    private val appUseCases: AppUseCases, private val userUseCase: UserUseCase
) : ViewModel() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val _authState = MutableStateFlow<FirebaseAuth?>(null)
    val authState: StateFlow<FirebaseAuth?> = _authState

    private val _uiState = MutableStateFlow(LoginUIState())
    val uiState: StateFlow<LoginUIState> = _uiState.asStateFlow()

    fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.Login -> {
            }

            else -> {}
        }
    }

    fun signIn(email: String, password: String, onSuccess: () -> Unit, onError: (String) -> Unit) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
//                    saveUserEmail(email)
                    getUserIdFromEmail(email)
                    onSuccess()
                } else {
                    onError(task.exception?.message ?: "Sign In Failed")
                }
            }
    }

    private fun saveUserEmail(userEmail: String) {
        viewModelScope.launch {
            appUseCases.saveAppInformation(userEmail)
        }
    }

    private fun saveUserId(userId: String) {
        TODO()
    }

    private fun getUserIdFromEmail(email: String) {
        Log.d("email", email)
        viewModelScope.launch {
            val response = userUseCase.getUserIdFromEmail(email)
            Log.d("get id", "$response")

            response.onSuccess { getResponse ->
                _uiState.update { currentState ->
                    currentState.copy(userID = getResponse.userId)
                }
                appUseCases.saveAppInformation(uiState.value.userID)
            }.onFailure {
                _uiState.update { currentState ->
                    currentState.copy(error = "Error")
                }
            }
        }
    }

}