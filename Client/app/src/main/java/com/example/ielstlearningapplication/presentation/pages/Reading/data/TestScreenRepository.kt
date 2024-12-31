package com.example.ielstlearningapplication.presentation.pages.Reading.data

class TestScreenRepository {

    private val testScreens = listOf(
        FakeTestScreen(
            id = "1",
            title = "Cambridge IELTS 16 Academic Reading - Test 1",
            id_practice = "123df12",
            id_comment = "3332swff"
        ),
        FakeTestScreen(
            id = "2",
            title = "Cambridge IELTS 16 Academic Reading - Test 2",
            id_practice = "3123df1",
            id_comment = "53332swf"
        ),
        // Add other FakeTestScreen items here
    )

    fun getTestScreenById(id: String?): FakeTestScreen? {
        return testScreens.find { it.id == id }
    }
}
