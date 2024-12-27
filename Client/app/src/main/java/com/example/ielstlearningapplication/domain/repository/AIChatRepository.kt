package com.example.ielstlearningapplication.domain.repository

import com.example.ielstlearningapplication.data.remote.dto.ChatResponse

interface AIChatRepository {
    suspend fun getChats(id: String): ChatResponse
}