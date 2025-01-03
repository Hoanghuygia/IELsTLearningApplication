package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.domain.models.ApiLessonResponse
import com.example.ielstlearningapplication.domain.models.ApiTestResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("reading")
    fun getReadings(): Call<ApiLessonResponse>
    @GET("listening")
    fun getListenings(): Call<ApiLessonResponse>

    @GET("reading/{id}")
    suspend fun getReadingById(@Path("id") id: String): ApiTestResponse
}

