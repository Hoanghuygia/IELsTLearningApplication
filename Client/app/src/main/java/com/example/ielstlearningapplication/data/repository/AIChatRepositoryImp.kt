package com.example.ielstlearningapplication.data.repository

import com.example.ielstlearningapplication.data.remote.ChatApi
import com.example.ielstlearningapplication.data.remote.dto.ChatResponse
import com.example.ielstlearningapplication.domain.repository.AIChatRepository

class AIChatRepositoryImp(private val chatService: ChatApi): AIChatRepository {
    override suspend fun getChats(id: String): ChatResponse {
        return chatService.getChats(id)
    }

}