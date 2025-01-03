package com.example.ielstlearningapplication.data.repository

import com.example.ielstlearningapplication.data.remote.UserApi
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterRequest
import com.example.ielstlearningapplication.data.remote.dto.user.RegisterResponse
import com.example.ielstlearningapplication.domain.repository.userRepository
import javax.inject.Inject

class userRepositoryImp @Inject constructor(
    private val userService: UserApi
): userRepository {
    override suspend fun registerNewUser(request: RegisterRequest): Result<RegisterResponse> {
        return try {
            Result.success(userService.registerUser(request))
        }catch (e: Exception){
            Result.failure(e)
        }
    }
}