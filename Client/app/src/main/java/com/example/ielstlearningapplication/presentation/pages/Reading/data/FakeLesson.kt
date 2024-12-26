// FakeLesson.kt
package com.example.ielstlearningapplication.presentation.pages.HomePage.data

import androidx.annotation.DrawableRes
import com.example.ielstlearningapplication.R

data class FakeLesson(
    @DrawableRes val image: Int,
    var text: String
)

val lessons = listOf(
    FakeLesson(R.drawable.done, "Cambridge IELTS 16 Academic Reading - Test 1"),
    FakeLesson(R.drawable.notdone, "Cambridge IELTS 16 Academic Reading - Test 2"),
    FakeLesson(R.drawable.clock, "Cambridge IELTS 16 Academic Reading - Test 3"),
    FakeLesson(R.drawable.notdone, "Cambridge IELTS 16 Academic Reading - Test 4"),
    FakeLesson(R.drawable.done, "Cambridge IELTS 16 Academic Reading - Test 5"),
    FakeLesson(R.drawable.notdone, "Cambridge IELTS 16 Academic Reading - Test 6"),
    FakeLesson(R.drawable.clock, "Cambridge IELTS 16 Academic Reading - Test 7"),
    FakeLesson(R.drawable.notdone, "Cambridge IELTS 16 Academic Reading - Test 8"),
    FakeLesson(R.drawable.done, "Cambridge IELTS 16 Academic Reading - Test 9"),
    FakeLesson(R.drawable.notdone, "Cambridge IELTS 16 Academic Reading - Test 10"),
    FakeLesson(R.drawable.clock, "Cambridge IELTS 16 Academic Reading - Test 11"),
    FakeLesson(R.drawable.notdone, "Cambridge IELTS 16 Academic Reading - Test 12")
)
