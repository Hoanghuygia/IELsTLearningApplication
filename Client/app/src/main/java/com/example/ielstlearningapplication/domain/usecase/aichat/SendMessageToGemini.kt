package com.example.ielstlearningapplication.domain.usecase.aichat

import com.example.ielstlearningapplication.data.remote.dto.SendMessageToGeminiReQuest
import com.example.ielstlearningapplication.data.remote.dto.SendMessageToGeminiResponse
import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import javax.inject.Inject

class SendMessageToGemini @Inject constructor(private val chatRepository: AIChatRepository) {
    suspend operator fun invoke(message: String): Result<SendMessageToGeminiResponse> {
        val request = SendMessageToGeminiReQuest(
            message = message
        )
        return chatRepository.sendMessageToGemini(request = request)
    }
}