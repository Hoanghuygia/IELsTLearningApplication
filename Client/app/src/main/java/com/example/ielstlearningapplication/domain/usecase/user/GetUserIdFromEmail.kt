package com.example.ielstlearningapplication.domain.usecase.user

import com.example.ielstlearningapplication.data.remote.dto.user.GetUserByEmailResponse
import com.example.ielstlearningapplication.domain.repository.userRepository
import javax.inject.Inject

class GetUserIdFromEmail @Inject constructor(
    private val userRepository: userRepository
) {
    suspend operator fun invoke(email: String): Result<GetUserByEmailResponse> {
        return userRepository.getUserIdFromEmail(email)
    }
}