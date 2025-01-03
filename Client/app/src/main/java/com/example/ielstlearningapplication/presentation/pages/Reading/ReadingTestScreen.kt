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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ielstlearningapplication.presentation.pages.Reading.components.CommentScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.components.PracticeScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.data.FakeTestScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.data.TestScreenRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingTestScreen(navController: NavHostController, lessonId: String? ) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Practice", "Comment")
    val testScreenRepository = TestScreenRepository()
    var testScreen by remember { mutableStateOf<FakeTestScreen?>(null) }

    LaunchedEffect(lessonId) {
        if (lessonId != null) {
            testScreen = testScreenRepository.getTestScreenById(lessonId)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    if (testScreen != null) {
                        Text(text = testScreen?.title ?: "Unknown")
                    }else {
                        Text(text = "Test not found")
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack()}) {
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
                0 -> testScreen?.let { PracticeScreen(navController, it) }
                1 -> CommentScreen()
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ReadingTestScreenPreview() {
//    val navController = rememberNavController()
//    ReadingTestScreen(navController)
//}
