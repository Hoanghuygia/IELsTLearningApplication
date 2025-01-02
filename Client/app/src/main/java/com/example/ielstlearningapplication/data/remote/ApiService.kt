package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.domain.models.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("reading")
    fun getReadings(): Call<ApiResponse>
}

