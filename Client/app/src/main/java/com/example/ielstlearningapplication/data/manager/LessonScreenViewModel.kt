package com.example.ielstlearningapplication.data.manager

import FakeLesson
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.di.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import retrofit2.awaitResponse

class LessonScreenViewModel : ViewModel() {

    val ac_readings = liveData(Dispatchers.IO) {
        val response = RetrofitInstance.api.getReadings().awaitResponse()
        if (response.isSuccessful) {
            val apiResponse = response.body()
            val apiLessons = apiResponse?.readings ?: emptyList()
            val fakeLessons = apiLessons
                .filter { it.type.equals("academic", ignoreCase = true) }
                .map {
                    FakeLesson(id = it._id, image = R.drawable.notdone, text = it.name ?: "No label")
                }
            emit(fakeLessons)
        } else {
            // Handle error
        }
    }

    val gt_readings = liveData(Dispatchers.IO) {
        val response = RetrofitInstance.api.getReadings().awaitResponse()
        if (response.isSuccessful) {
            val apiResponse = response.body()
            val apiLessons = apiResponse?.readings ?: emptyList()
            val fakeLessons = apiLessons
                .filter { it.type.equals("general training", ignoreCase = true) }
                .map {
                    FakeLesson(id = it._id, image = R.drawable.notdone, text = it.name ?: "No label")
                }
            emit(fakeLessons)
        } else {
            // Handle error
        }
    }


}

