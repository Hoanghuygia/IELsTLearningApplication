package com.example.buildprojectwithcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WritingFeedbackScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 60.dp),
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
    )
    { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Est. Overall Band Score",
                fontSize = 20.sp,
                fontWeight = FontWeight.W600,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "0.0",
                fontSize = 128.sp,
                fontWeight = FontWeight.W600,
                color = Color(0xFF002147),
                modifier = Modifier
                    .padding(bottom = 16.dp)
            )
            val feedbacks = listOf(
                "Task Response: 0.0",
                "Coherence & Cohesion: 0.0",
                "Grammatical Range & Accuracy: 0.0",
                "Lexical Resource: 0.0"
            )
            feedbacks.forEach { feedback ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(95.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFFD700))
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = feedback,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WritingFeedbackScreenPreview() {
    WritingFeedbackScreen()
}

