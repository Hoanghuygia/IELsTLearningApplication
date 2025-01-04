package com.example.ielstlearningapplication.presentation.pages.SignUp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
class SignUpModel @Inject constructor(
    private val userUseCase: UserUseCase
): ViewModel() {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val _authState = MutableStateFlow<FirebaseAuth?>(null)
    val authState: StateFlow<FirebaseAuth?> = _authState

    private val _uiState = MutableStateFlow(SignUpUiState())
    val uiState: StateFlow<SignUpUiState> = _uiState.asStateFlow()

    fun signUp(email: String, password: String, userName: String, onSuccess: () -> Unit, onError: (String) -> Unit) {
        viewModelScope.launch{
            try {
                userUseCase.createUser(email = email, password = password, userName = userName)

            }catch (e: Exception){

            }
        }
        viewModelScope.launch {
            val result = runCatching {
                userUseCase.createUser(email = email, password = password, userName = userName)
            }
            Log.d("User create", "$result")

            result.onSuccess { messages ->
                _uiState.update { currentState ->
                    currentState.copy(
                        error = "User created successfully"
                    )
                }
            }.onFailure { e ->
                _uiState.update { currentState ->
                    currentState.copy(
                        error = "Failed to create user"
                    )
                }
            }
        }

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    onSuccess()
                } else {
                    onError(task.exception?.message ?: "Sign Up Failed")
                }
            }
    }
}