package com.example.ielstlearningapplication.data.repository

import android.util.Log
import com.example.ielstlearningapplication.data.remote.ChatApi
import com.example.ielstlearningapplication.data.remote.dto.ChatResponseNew
import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import javax.inject.Inject

class AIChatRepositoryImp @Inject constructor(
    private val chatService: ChatApi
) : AIChatRepository {
    override suspend fun getChats(id: String): Result<ChatResponseNew> {
        Log.d("in aichatrespository", "Response: ")
        return try {
            Result.success(chatService.getChats(id))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}