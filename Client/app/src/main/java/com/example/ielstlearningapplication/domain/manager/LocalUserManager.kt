package com.example.ielstlearningapplication.domain.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun saveUserEmail(userEmail: String)
    fun readUserEmail(): Flow<String>
}