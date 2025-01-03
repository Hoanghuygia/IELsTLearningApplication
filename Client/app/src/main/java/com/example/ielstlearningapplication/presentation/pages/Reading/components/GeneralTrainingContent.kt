package com.example.ielstlearningapplication.presentation.pages.Reading.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.ielstlearningapplication.data.manager.LessonScreenViewModel

@Composable
fun GeneralTrainingContent(navController: NavHostController, viewModel: LessonScreenViewModel = viewModel()) {
    val lessons = viewModel.gt_readings.observeAsState(initial = listOf())
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(lessons.value) { lesson ->
            LessonReadingItem(lesson, navController)
        }
    }
}

