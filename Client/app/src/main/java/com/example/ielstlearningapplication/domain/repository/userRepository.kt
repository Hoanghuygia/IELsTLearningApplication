package com.example.ielstlearningapplication.domain.repository

import com.example.ielstlearningapplication.data.remote.dto.user.RegisterRequest
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterResponse

interface userRepository {
    suspend fun registerNewUser(request: RegisterRequest): Result<RegisterResponse>
}