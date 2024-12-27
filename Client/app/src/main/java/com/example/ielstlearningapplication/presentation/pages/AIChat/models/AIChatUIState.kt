package com.example.ielstlearningapplication.presentation.pages.AIChat.models

import com.example.ielstlearningapplication.presentation.pages.AIChat.data.DataChat

data class AIChatUIState(
    var valueTextField: String = "",
    var currentChat: List<Any> = DataChat.aMessage
)
