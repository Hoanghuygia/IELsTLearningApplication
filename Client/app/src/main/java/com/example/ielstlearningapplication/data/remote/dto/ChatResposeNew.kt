package com.example.ielstlearningapplication.data.remote.dto

import com.example.ielstlearningapplication.domain.models.Data

data class ChatResponseNew(
    val `data`: Data,
    val success: Boolean
)