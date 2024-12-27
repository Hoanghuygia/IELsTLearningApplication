package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.data.remote.dto.ChatResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ChatApi {
    @GET("aichat/{id}")
    suspend fun getChats(
        @Path("id") id: String
    ): ChatResponse
}