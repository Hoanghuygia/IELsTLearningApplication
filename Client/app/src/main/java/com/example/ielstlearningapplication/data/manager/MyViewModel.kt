package com.example.ielstlearningapplication.data.manager

import FakeLesson
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.di.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import retrofit2.awaitResponse

class MyViewModel : ViewModel() {

    val readings = liveData(Dispatchers.IO) {
        val response = RetrofitInstance.api.getReadings().awaitResponse()
        if (response.isSuccessful) {
            val apiResponse = response.body()
            val apiLessons = apiResponse?.readings ?: emptyList()
            val fakeLessons = apiLessons.map {
                FakeLesson(id = it._id, image = R.drawable.notdone, text = it.name?: "No label")
            }
            emit(fakeLessons)
        } else {
            // Xử lý lỗi
        }
    }
}

