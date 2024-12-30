package com.example.ielstlearningapplication.presentation.pages.AIChat.models

//import com.example.ielstlearningapplication.presentation.pages.AIChat.data.DataChat
//import com.example.ielstlearningapplication.presentation.pages.AIChat.data.Message
import com.example.ielstlearningapplication.domain.models.Message

data class AIChatUIState(
    var valueTextField: String = "",
//    var currentChat: List<Message> = DataChat.aMessage,
    var messages: List<Message> = emptyList<Message>(),
    var currentChat: Int = 0,
    var chatLabel: String = "",
    var isLoading: Boolean = false,
    var error: String = "No Error"
)
