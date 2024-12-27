package com.example.buildprojectwithcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.pages.Listening.components.CommentListeningContent
import com.example.ielstlearningapplication.presentation.pages.Listening.components.PracticeListeningContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListeningTestScreen(
    navController: NavHostController,
    title: String // Thêm title làm tham số
) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Practice", "Comment")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(title) // Sử dụng title từ tham số
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
                0 -> PracticeListeningContent(navController)
                1 -> CommentListeningContent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListeningTestScreenPreview() {
    val navController = rememberNavController()
    val mockTitle = "Listening Test 1" // Giá trị từ JSON
    ListeningTestScreen(navController, title = mockTitle)
}
