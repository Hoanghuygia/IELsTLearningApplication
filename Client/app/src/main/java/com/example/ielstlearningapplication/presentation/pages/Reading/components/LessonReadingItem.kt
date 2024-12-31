package com.example.ielstlearningapplication.presentation.pages.Reading.components

import FakeLesson
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LessonReadingItem(lesson: FakeLesson, navController: NavHostController) {
    Row(
        modifier = Modifier
            .clickable {
                navController.navigate("readingTestScreen/${lesson.id}")
            }
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = lesson.image),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = lesson.text,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

