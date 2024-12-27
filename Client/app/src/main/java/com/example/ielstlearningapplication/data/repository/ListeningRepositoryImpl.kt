package com.example.ielstlearningapplication.data.repository

import com.example.ielstlearningapplication.data.remote.ListeningApi
import com.example.ielstlearningapplication.domain.models.ListeningResponse
import com.example.ielstlearningapplication.domain.repository.ListeningRepository

class ListeningRepositoryImpl(private val api: ListeningApi) : ListeningRepository {
    override suspend fun fetchListeningData(): ListeningResponse {
        return api.getListeningData()
    }
}