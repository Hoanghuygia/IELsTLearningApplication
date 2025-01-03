package com.example.ielstlearningapplication.domain.usecase.user

import com.example.ielstlearningapplication.data.remote.dto.user.RegisterRequest
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterResponse
import com.example.ielstlearningapplication.domain.repository.userRepository
import javax.inject.Inject

class CreateUser @Inject constructor(private val repository: userRepository) {
    suspend operator fun invoke(
        email: String,
        password: String,
        userName: String
    ): Result<RegisterResponse> {
        val request = RegisterRequest(
            email = email,
            password = password,
            userName = userName)
        return repository.registerNewUser(request = request)
    }
}