package com.example.ielstlearningapplication.domain.models

data class ApiResponse(
    val message: String,
    val readings: List<ApiLesson>
)
