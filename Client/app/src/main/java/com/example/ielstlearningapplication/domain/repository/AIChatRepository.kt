package com.example.ielstlearningapplication.domain.repository

import com.example.ielstlearningapplication.data.remote.dto.ChatResponseNew

interface AIChatRepository {
    suspend fun getChats(id: String): Result<ChatResponseNew>
}