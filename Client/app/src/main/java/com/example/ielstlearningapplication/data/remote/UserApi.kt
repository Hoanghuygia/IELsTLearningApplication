package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.data.remote.dto.user.GetUserByEmailResponse
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterRequest
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserApi {
    @POST("auth/register")
    suspend fun registerUser(@Body request: RegisterRequest): RegisterResponse

    @GET("user/{email}")
    suspend fun getUserIdByEmail(@Path("email") email: String): GetUserByEmailResponse
}