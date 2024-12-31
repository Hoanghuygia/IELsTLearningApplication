package com.example.ielstlearningapplication.domain.repository

import com.example.ielstlearningapplication.data.remote.dto.ChatResponseNew
import com.example.ielstlearningapplication.data.remote.dto.SendMessageRequest
import com.example.ielstlearningapplication.data.remote.dto.SendMessageResponse

interface AIChatRepository {
    suspend fun getChats(id: String): Result<ChatResponseNew>

    suspend fun sendMessage(request: SendMessageRequest): Result<SendMessageResponse>
}