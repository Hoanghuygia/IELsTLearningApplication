package com.example.ielstlearningapplication.presentation.pages.Speaking.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.pages.Listening.components.LessonItem

@Composable
fun Part3Content(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val items = listOf(
            R.drawable.done to "Discuss the impact of hobbies on personal development.",
            R.drawable.notdone to "Discuss how daily routines can affect our productivity.",
            R.drawable.clock to "Discuss the importance of hometowns in shaping individuals.",
            R.drawable.notdone to "Discuss the role of technology in modern education.",
            R.drawable.done to "Discuss the potential benefits and challenges of space exploration.",
            R.drawable.notdone to "Discuss how job satisfaction influences quality of life.",
            R.drawable.clock to "Discuss the benefits of travel for personal growth.",
            R.drawable.notdone to "Discuss the significance of wildlife conservation.",
            R.drawable.done to "Discuss the influence of fashion on cultural identity.",
            R.drawable.notdone to "Discuss the changing dynamics of family structures.",
            R.drawable.clock to "Discuss the role of schools in developing social skills.",
            R.drawable.notdone to "Discuss how food culture reflects the traditions of a society."
        )


        items(items) { (icon, text) ->
            LessonItem(icon = icon, text = text)
        }
    }
}