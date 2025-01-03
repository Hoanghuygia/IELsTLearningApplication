package com.example.ielstlearningapplication.presentation.pages.Reading.data

import com.example.ielstlearningapplication.di.RetrofitInstance


class TestScreenRepository {

    suspend fun getTestScreenById(id: String?): FakeTestScreen? {
        return if (id != null) {
            try {
                val response = RetrofitInstance.api.getReadingById(id)
                val reading = response.reading

                val firstPassage = reading.content?.passages?.firstOrNull()
                val numQuestions = firstPassage?.questionGroup?.sumOf { it.questions.size } ?: 0

                FakeTestScreen(
                    id = reading._id,
                    title = reading.label,
//                    title= numQuestions.toString(),
                    id_content= reading.content._id,
                    p1_num_question = numQuestions
                )
            } catch (e: Exception) {
                e.printStackTrace()  // This will print the stack trace in Logcat
                null
            }
        } else {
            null
        }
    }
}
