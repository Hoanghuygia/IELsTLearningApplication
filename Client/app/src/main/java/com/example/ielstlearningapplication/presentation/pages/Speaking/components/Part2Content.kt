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
fun Part2Content(navController: NavController){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val items = listOf(
            R.drawable.done to "Describe a hobby you enjoy.",
            R.drawable.notdone to "Describe your daily routine.",
            R.drawable.clock to "Describe your hometown.",
            R.drawable.notdone to "Describe a piece of technology you find useful.",
            R.drawable.done to "Describe a place in space you would like to visit.",
            R.drawable.notdone to "Describe your job or a job you would like to have.",
            R.drawable.clock to "Describe a memorable trip you took.",
            R.drawable.notdone to "Describe an animal that is important in your country.",
            R.drawable.done to "Describe a fashion trend you like.",
            R.drawable.notdone to "Describe a family member you admire.",
            R.drawable.clock to "Describe your school days.",
            R.drawable.notdone to "Describe a type of food you like."

        )

        items(items) { (icon, text) ->
            LessonItem(icon = icon, text = text, navController)
        }
    }
}