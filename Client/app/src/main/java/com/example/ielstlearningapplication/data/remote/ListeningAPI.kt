package com.example.ielstlearningapplication.data.remote

import com.example.ielstlearningapplication.domain.models.ListeningResponse
import retrofit2.http.GET

interface ListeningApi {
    @GET("listening")
    suspend fun getListeningData(): ListeningResponse
}