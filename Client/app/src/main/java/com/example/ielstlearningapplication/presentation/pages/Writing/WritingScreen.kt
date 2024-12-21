package com.example.ielstlearningapplication.presentation.pages.Writing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.buildprojectwithcompose.Task1Screen
import com.example.buildprojectwithcompose.Task2Screen
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WritingScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Task 1", "Task 2")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Writing Feedback",
                            textAlign = TextAlign.Center,
                            color = Color(0xFF002147),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W400
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back navigation */ }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            TabRow(selectedTabIndex = selectedTab) {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = { Text(tab) }
                    )
                }
            }
            when (selectedTab) {
                0 -> Task1Screen()
                1 -> Task2Screen()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun WritingScreenPreview() {
    IELsTLearningApplicationTheme{
        WritingScreen()
    }
}