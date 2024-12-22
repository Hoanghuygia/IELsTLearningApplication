package com.example.assignmeninclass1712

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.assignmeninclass1712.presentation.LoginPage
import com.example.assignmeninclass1712.presentation.LoginPageViewModel
import com.example.compose.AppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignmeninclass1712.data.PageRoute
import com.example.assignmeninclass1712.presentation.ForgetPassword
import com.example.assignmeninclass1712.presentation.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                val viewModel: LoginPageViewModel = viewModel()
                val uiState by viewModel.uiState.collectAsState()

                if(uiState.currentPage == PageRoute.LOGIN_PAGE){
                    LoginPage(viewModel = viewModel)
                }
                else if (uiState.currentPage == PageRoute.HOME_PAGE){
                    HomePage()
                }
                else{
                    ForgetPassword()
                }
            }
        }
    }
}

