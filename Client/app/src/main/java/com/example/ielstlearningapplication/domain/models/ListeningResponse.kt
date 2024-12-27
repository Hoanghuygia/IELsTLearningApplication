package com.example.ielstlearningapplication.domain.models

data class ListeningResponse(
    val message: String,
    val listenings: List<Listening>
)

data class Listening(
    val _id: String,
    val label: String,
    val type: String,
    val content: ListeningContent
)

data class ListeningContent(
    val _id: String,
    val comments: List<Comment>,
    val instructions: String,
    val passages: List<Passage>
)

data class Comment(
    val _id: String,
    val comment_id: Int,
    val user_id: String,
    val content: String,
    val like: Int,
    val timestamp: String
)

data class Passage(
    val _id: String,
    val passage_id: Int,
    val title: String,
    val paragraph: String?,
    val questionGroup: List<QuestionGroup>,
    val audioURL: String,
    val type: String
)

data class QuestionGroup(
    val _id: String,
    val instruction: String,
    val questions: List<Question>
)

data class Question(
    val _id: String,
    val question_id: String,
    val question: String,
    val option: List<String>,
    val answer: String
)

