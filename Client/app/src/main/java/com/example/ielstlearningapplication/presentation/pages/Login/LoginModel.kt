package com.example.ielstlearningapplication.presentation.pages.Login
//
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.domain.usecase.app.AppUseCases
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginModel @Inject constructor(
    private val appUseCases: AppUseCases
) : ViewModel() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val _authState = MutableStateFlow<FirebaseAuth?>(null)
    val authState: StateFlow<FirebaseAuth?> = _authState

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
                    saveUserEmail(email)
                    onSuccess()
                } else {
                    onError(task.exception?.message ?: "Sign In Failed")
                }
            }
    }

    private fun saveUserEmail(userEmail: String){
        viewModelScope.launch{
            appUseCases.saveAppInformation(userEmail)
        }
    }
}