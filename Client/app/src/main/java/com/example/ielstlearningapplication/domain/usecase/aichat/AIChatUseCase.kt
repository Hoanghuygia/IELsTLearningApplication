package com.example.ielstlearningapplication.domain.usecase.aichat

data class AIChatUseCase(
    val getMessage: GetMessage,
    val sendMessage: SendMessage,
    val sendMessageToGemini: SendMessageToGemini
)
