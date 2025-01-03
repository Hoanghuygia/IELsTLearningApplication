package com.example.ielstlearningapplication.domain.usecase.app

import com.example.ielstlearningapplication.domain.manager.LocalUserManager

class SaveAppInformation(private val localUserManager: LocalUserManager) {
    suspend operator fun invoke(userEmail: String){
        localUserManager.saveUserEmail(userEmail)
    }
}