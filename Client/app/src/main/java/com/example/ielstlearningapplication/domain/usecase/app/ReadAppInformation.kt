package com.example.ielstlearningapplication.domain.usecase.app

import com.example.ielstlearningapplication.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppInformation(private val localUserManager: LocalUserManager) {
    operator fun invoke(): Flow<String>{
        return localUserManager.readUserEmail()
    }
}