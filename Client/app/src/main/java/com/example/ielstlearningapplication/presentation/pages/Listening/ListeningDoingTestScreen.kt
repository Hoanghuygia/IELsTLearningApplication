package com.example.ielstlearningapplication.presentation.pages.Listening

import Part1Screen
import Part2Screen
import Part3Screen
import Passage1Screen
import Passage2Screen
import Passage3Screen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListeningDoingTestScreen(navController: NavHostController) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Part 1", "Part 2", "Part 3")
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(onClick = { /* Handle back navigation */ }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { navController.navigate("onListeningAnswerScreen") },
                        modifier = Modifier
                            .width(64.dp)
                            .height(36.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFFFD700))
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Submit", style = TextStyle(color = Color.White))
                    }
                    Spacer(modifier = Modifier.width(10.dp))
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
                0 -> Part1Screen()
                1 -> Part2Screen()
                2 -> Part3Screen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListeningDoingTestScreenPreview() {
    val navController = rememberNavController()
    ListeningDoingTestScreen(navController)

}
