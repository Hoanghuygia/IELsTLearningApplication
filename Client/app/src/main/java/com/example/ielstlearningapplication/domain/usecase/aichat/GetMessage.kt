package com.example.ielstlearningapplication.domain.usecase.aichat

import com.example.ielstlearningapplication.data.remote.dto.ChatResponse
import com.example.ielstlearningapplication.domain.repository.AIChatRepository

class GetMessage(private val chatRepository: AIChatRepository) {
    suspend operator fun invoke(id: String): ChatResponse{
        return chatRepository.getChats(id);
    }

}