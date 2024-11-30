package com.example.ielstlearningapplication.presentation.pages.Login

import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.HomePageEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginModel @Inject constructor(): ViewModel() {

    fun onEvent(event: LoginEvent){
        when(event){
            is LoginEvent.Login -> {
            }
            else -> {}
        }
    }
}