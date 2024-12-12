package com.example.ielstlearningapplication.presentation.pages.Reading.components

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
fun PracticeScreen(navController: NavHostController) {
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
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(135.dp)
                .border(BorderStroke(1.dp, Color(0xFFD9D9D9)), shape = RoundedCornerShape(4.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(modifier = Modifier.padding(15.dp, 5.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = selectedPassage1,
                        onCheckedChange = { selectedPassage1 = it }
                    )
                    Text(
                        text = "Passage 1 (13 questions)",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W400
                    )
                }
                Text(
                    text = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                    modifier = Modifier.padding(horizontal = 50.dp),
                    fontSize = 12.sp,
                    lineHeight = 18.sp
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(135.dp)
                .border(BorderStroke(1.dp, Color(0xFFD9D9D9)), shape = RoundedCornerShape(4.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(modifier = Modifier.padding(15.dp, 5.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = selectedPassage2,
                        onCheckedChange = { selectedPassage2 = it }
                    )
                    Text(
                        text = "Passage 2 (13 questions)",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W400
                    )
                }
                Text(
                    text = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                    modifier = Modifier.padding(horizontal = 50.dp),
                    fontSize = 12.sp,
                    lineHeight = 18.sp
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(135.dp)
                .border(BorderStroke(1.dp, Color(0xFFD9D9D9)), shape = RoundedCornerShape(4.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(modifier = Modifier.padding(15.dp, 5.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = selectedPassage3,
                        onCheckedChange = { selectedPassage3 = it }
                    )
                    Text(
                        text = "Passage 3 (13 questions)",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W400
                    )
                }
                Text(
                    text = "Table/Note/Flow chart Completion\nSentence Completion\nTrue/False/Not Given",
                    modifier = Modifier.padding(horizontal = 50.dp),
                    fontSize = 12.sp,
                    lineHeight = 18.sp
                )

            }
        }
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { navController.navigate("onReadingAnswerScreen") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFD700),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = "Practice",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

    }
}
