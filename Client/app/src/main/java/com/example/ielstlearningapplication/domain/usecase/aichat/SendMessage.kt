package com.example.ielstlearningapplication.domain.usecase.aichat

import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import javax.inject.Inject

class SendMessage @Inject constructor(private val repository: AIChatRepository) {
    suspend operator fun invoke(){
    }
}