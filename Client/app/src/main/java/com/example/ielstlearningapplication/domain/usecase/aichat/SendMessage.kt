package com.example.ielstlearningapplication.domain.usecase.aichat

import com.example.ielstlearningapplication.data.remote.dto.SendMessageRequest
import com.example.ielstlearningapplication.data.remote.dto.SendMessageResponse
import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import javax.inject.Inject

class SendMessage @Inject constructor(private val repository: AIChatRepository) {
    suspend operator fun invoke(content: String, userId: String, chatId: String): Result<SendMessageResponse> {
        val request = SendMessageRequest(
            content = content,
            entity = "0",
            userId = userId,
            chat_id = chatId
        )
        return repository.sendMessage(request = request)
    }
}