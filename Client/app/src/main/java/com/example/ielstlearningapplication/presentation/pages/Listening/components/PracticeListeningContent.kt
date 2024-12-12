package com.example.ielstlearningapplication.presentation.pages.Listening.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Select the section you want to take.",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W600
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        PassageCard(
            title = "Passage 1 (13 questions)",
            description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
            isChecked = selectedPassage2,
            onCheckedChange = { selectedPassage2 = it }
        )
        PassageCard(
            title = "Passage 2 (13 questions)",
            description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
            isChecked = selectedPassage2,
            onCheckedChange = { selectedPassage2 = it }
        )
        PassageCard(
            title = "Passage 3 (13 questions)",
            description = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
            isChecked = selectedPassage2,
            onCheckedChange = { selectedPassage2 = it }
        )

        Spacer(modifier = Modifier.weight(1f))
        
        MaxButton(
            text = "Practice",
            onClick = { navController.navigate("onReadingAnswerScreen") },
        )


    }
}