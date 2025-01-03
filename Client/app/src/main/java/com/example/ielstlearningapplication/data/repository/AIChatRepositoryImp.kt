package com.example.ielstlearningapplication.data.repository

import com.example.ielstlearningapplication.data.remote.ChatApi
import com.example.ielstlearningapplication.data.remote.dto.chat.ChatResponseNew
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageRequest
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageResponse
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageToGeminiReQuest
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageToGeminiResponse
import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import javax.inject.Inject

class AIChatRepositoryImp @Inject constructor(
    private val chatService: ChatApi
) : AIChatRepository {
    override suspend fun getChats(id: String): Result<ChatResponseNew> {
        return try {
            Result.success(chatService.getChats(id))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun sendMessage(request: SendMessageRequest): Result<SendMessageResponse>{
        return try {
            Result.success(chatService.sendMessage(request))
        }catch(e: Exception){
            Result.failure(e)
        }
    }

    override suspend fun sendMessageToGemini(request: SendMessageToGeminiReQuest): Result<SendMessageToGeminiResponse>{
        return try {
            Result.success((chatService.sendMessageToGemini(request)))
        }catch (e: Exception){
            Result.failure(e)
        }
    }
}