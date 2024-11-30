package com.example.ielstlearningapplication.presentation.mainActivity

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import com.example.ielstlearningapplication.presentation.navGraph.Route
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//@HiltViewModel
class MainViewModel : ViewModel() {
    private val _splashCondition = mutableStateOf(true)
    val splashCondition: State<Boolean> get() = _splashCondition

    private val _startDestination = mutableStateOf(Route.LoginScreen.route)
    val startDestination: State<String> get() = _startDestination

    init {
        viewModelScope.launch() {
            delay(200)
            _splashCondition.value = false
        }
    }
}