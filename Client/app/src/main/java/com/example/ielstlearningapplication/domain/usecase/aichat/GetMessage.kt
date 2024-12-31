package com.example.ielstlearningapplication.domain.usecase.aichat

import com.example.ielstlearningapplication.data.remote.dto.ChatResponseNew
import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import javax.inject.Inject

class GetMessage @Inject constructor(private val chatRepository: AIChatRepository){
    suspend operator fun invoke(id: String): Result<ChatResponseNew> {
        return chatRepository.getChats(id);
    }
}
