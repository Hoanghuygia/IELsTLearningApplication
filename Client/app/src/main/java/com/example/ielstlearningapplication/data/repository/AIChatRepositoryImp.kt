package com.example.ielstlearningapplication.data.repository

import android.util.Log
import com.example.ielstlearningapplication.data.remote.ChatApi
import com.example.ielstlearningapplication.data.remote.dto.ChatResponseNew
import com.example.ielstlearningapplication.data.remote.dto.SendMessageRequest
import com.example.ielstlearningapplication.data.remote.dto.SendMessageResponse
import com.example.ielstlearningapplication.data.remote.dto.SendMessageToGeminiReQuest
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

    override suspend fun sendMessageToGemini(reQuest: SendMessageToGeminiReQuest): Result<SendMessageResponse>{
        return try {
            Result.success((chatService.sendMessageToGemini(reQuest)))
        }catch (e: Exception){
            Result.failure(e)
        }
    }
}