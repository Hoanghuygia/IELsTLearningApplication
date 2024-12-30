package com.example.ielstlearningapplication.domain.models

data class Message(
    val _id: String = "Default",
    val content: String,
    val entity: Int,
    val id: String = "0",
    val timestamp: String
)