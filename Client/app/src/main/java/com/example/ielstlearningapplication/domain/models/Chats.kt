package com.example.ielstlearningapplication.domain.models

data class Chats(
    val _id: String,
    val id: String,
    val label: String,
    val messages: List<Message>
)