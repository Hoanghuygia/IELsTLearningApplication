package com.example.ielstlearningapplication.presentation.pages.Listening.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PracticeListeningContent(navController: NavHostController) {
    var selectedPassage1 by remember { mutableStateOf(false) }
    var selectedPassage2 by remember { mutableStateOf(false) }
    var selectedPassage3 by remember { mutableStateOf(false) }
    var selectedPassage4 by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Text(
                text = "Select the section you want to take.",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        item {
            PassageCard(
                title = "Part 1 (10 questions)",
                description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                isChecked = selectedPassage1,
                onCheckedChange = { selectedPassage1 = it }
            )
        }

        item {
            PassageCard(
                title = "Part 2 (10 questions)",
                description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                isChecked = selectedPassage2,
                onCheckedChange = { selectedPassage2 = it }
            )
        }

        item {
            PassageCard(
                title = "Part 3 (10 questions)",
                description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                isChecked = selectedPassage3,
                onCheckedChange = { selectedPassage3 = it }
            )
        }

        item {
            PassageCard(
                title = "Part 4 (10 questions)",
                description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                isChecked = selectedPassage4,
                onCheckedChange = { selectedPassage4 = it }
            )
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            MaxButton(
                text = "Practice",
                onClick = { navController.navigate("onListeningDoingTestScreen") },
            )
        }
    }
}
