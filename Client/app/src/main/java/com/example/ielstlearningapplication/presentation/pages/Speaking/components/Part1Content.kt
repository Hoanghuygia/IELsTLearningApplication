package com.example.ielstlearningapplication.presentation.pages.Speaking.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ielstlearningapplication.R

@Composable
fun Part1Content(navController: NavController){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val items = listOf(
            R.drawable.done to "Hobbies",
            R.drawable.notdone to "Daily Routine",
            R.drawable.clock to "Hometown",
            R.drawable.notdone to "Technology",
            R.drawable.done to "Space",
            R.drawable.notdone to "Work",
            R.drawable.clock to "Travel",
            R.drawable.notdone to "Animals",
            R.drawable.done to "Fashion",
            R.drawable.notdone to "Family",
            R.drawable.clock to "School",
            R.drawable.notdone to "Food"
        )

        items(items) { (icon, text) ->
            LessonItem(icon = icon, text = text, navController)
        }
    }
}