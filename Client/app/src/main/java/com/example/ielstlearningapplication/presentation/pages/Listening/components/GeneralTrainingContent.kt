package com.example.ielstlearningapplication.presentation.pages.Listening.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ielstlearningapplication.R

@Composable
fun GeneralTrainingContent(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val items = listOf(
            R.drawable.notdone to "Cambridge IELTS 16 General Training Listening - Test 1",
            R.drawable.notdone to "Cambridge IELTS 16 General Training Listening - Test 2",
            R.drawable.notdone to "Cambridge IELTS 16 General Training Listening - Test 3",
            R.drawable.notdone to "Cambridge IELTS 16 General Training Listening - Test 4"
        )

        items(items) { (icon, text) ->
            LessonItem(icon = icon, text = text, navController)
        }    }
}