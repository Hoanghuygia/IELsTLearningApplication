package com.example.ielstlearningapplication.domain.repository

import com.example.ielstlearningapplication.data.remote.dto.chat.ChatResponseNew
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageRequest
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageResponse
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageToGeminiReQuest
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageToGeminiResponse

interface AIChatRepository {
    suspend fun getChats(id: String): Result<ChatResponseNew>

    suspend fun sendMessage(request: SendMessageRequest): Result<SendMessageResponse>

    suspend fun sendMessageToGemini(request: SendMessageToGeminiReQuest): Result<SendMessageToGeminiResponse>
}