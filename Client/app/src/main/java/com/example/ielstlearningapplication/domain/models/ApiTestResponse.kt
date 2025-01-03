package com.example.ielstlearningapplication.domain.models

import com.example.ielstlearningapplication.presentation.pages.Reading.data.FakeTestScreen

data class ApiTestResponse(
    val message: String,
    val reading: ApiTest
)
