package com.example.ielstlearningapplication.data.remote.dto.chat

data class SendMessageRequest(
    val content: String,
    val entity: String,
    val userId: String,
    val chat_id: String
)
