package com.example.ielstlearningapplication.domain.models

data class ApiTest (
    val _id: String,
    val name: String,
    val type: String,
    val content: ApiContent
)
data class ApiContent(
    val _id: String,
    val comments: List<ApiComment>,
    val instructions: String,
    val passages: List<ApiPassage>
)
data class ApiComment(
    val _id: String,
    val comment_id: Int,
    val user_id: String,
    val content: String,
    val like: Int,
    val timestamp: String
)

data class ApiPassage(
    val _id: String,
    val passage_id: Int,
    val title: String,
    val paragraph: String?,
    val questionGroup: List<ApiQuestionGroup>,
    val audioURL: String,
    val type: String
)

data class ApiQuestionGroup(
    val _id: String,
    val instruction: String,
    val questions: List<ApiQuestion>
)

data class ApiQuestion(
    val _id: String,
    val question_id: String,
    val question: String,
    val option: List<String>,
    val answer: String
)
