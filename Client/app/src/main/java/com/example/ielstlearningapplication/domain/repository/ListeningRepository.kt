package com.example.ielstlearningapplication.domain.repository

import com.example.ielstlearningapplication.domain.models.ListeningResponse

interface ListeningRepository {
    suspend fun fetchListeningData(): ListeningResponse
}