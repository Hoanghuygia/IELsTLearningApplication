package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.data.remote.dto.chat.ChatResponseNew
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageRequest
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageResponse
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageToGeminiReQuest
import com.example.ielstlearningapplication.data.remote.dto.chat.SendMessageToGeminiResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ChatApi {
    @GET("aichat/{id}")
    suspend fun getChats(@Path("id") id: String): ChatResponseNew

    @POST("aichat/sendMessage")
    suspend fun sendMessage(@Body request: SendMessageRequest): SendMessageResponse

    @POST("aichat/chatGPT")
    suspend fun sendMessageToGemini(@Body request: SendMessageToGeminiReQuest): SendMessageToGeminiResponse
}