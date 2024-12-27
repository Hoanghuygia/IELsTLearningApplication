package com.example.ielstlearningapplication.data.remote.dto

import com.example.ielstlearningapplication.domain.models.Chat

data class ChatResponse(
    val success: Boolean,
    val data: List<Chat>
)
