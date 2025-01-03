package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.data.remote.dto.user.RegisterRequest
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("auth/register")
    suspend fun registerUser(@Body request: RegisterRequest): RegisterResponse
}