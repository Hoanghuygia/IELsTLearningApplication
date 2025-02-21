package com.example.buildprojectwithcompose

import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.pages.Reading.components.CommentScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.components.PracticeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingTestScreen(navController: NavHostController) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Practice", "Comment")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Cambridge IELTS 16 Academic \n" +
                                "Reading - Test 1"
                    )
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
        },
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
                0 -> PracticeScreen(navController)
                1 -> CommentScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReadingTestScreenPreview() {
    val navController = rememberNavController()
    ReadingTestScreen(navController)
}
