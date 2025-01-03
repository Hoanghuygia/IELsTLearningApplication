package com.example.ielstlearningapplication.data.remote.dto.chat

import com.example.ielstlearningapplication.domain.models.MessageDataSend

data class SendMessageResponse(
    val success: Boolean,
    val message: String,
    val data: MessageDataSend
)
