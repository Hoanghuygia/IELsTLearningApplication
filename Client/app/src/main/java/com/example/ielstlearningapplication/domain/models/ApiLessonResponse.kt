package com.example.ielstlearningapplication.domain.models

data class ApiLessonResponse(
    val message: String,
    val readings: List<ApiLesson>
)
