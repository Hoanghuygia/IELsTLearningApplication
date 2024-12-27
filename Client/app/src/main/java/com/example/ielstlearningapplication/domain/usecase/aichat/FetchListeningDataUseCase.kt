package com.example.ielstlearningapplication.domain.usecase.aichat

import com.example.ielstlearningapplication.domain.models.ListeningResponse
import com.example.ielstlearningapplication.domain.repository.ListeningRepository

class FetchListeningDataUseCase(private val repository: ListeningRepository) {
    suspend fun execute(): ListeningResponse {
        return repository.fetchListeningData()
    }
}
