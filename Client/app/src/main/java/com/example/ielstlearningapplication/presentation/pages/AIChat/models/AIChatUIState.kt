package com.example.ielstlearningapplication.presentation.pages.AIChat.models

import com.example.ielstlearningapplication.presentation.pages.AIChat.data.DataChat
import com.example.ielstlearningapplication.presentation.pages.AIChat.data.Message

data class AIChatUIState(
    var valueTextField: String = "",
    var currentChat: List<Message> = DataChat.aMessage
)
