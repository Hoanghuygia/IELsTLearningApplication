package com.example.ielstlearningapplication.data.remote.dto

import com.example.ielstlearningapplication.domain.models.Article

data class NewRespond(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)