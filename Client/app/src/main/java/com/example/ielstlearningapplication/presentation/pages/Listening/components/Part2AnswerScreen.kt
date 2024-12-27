package com.example.ielstlearningapplication.presentation.pages.Listening.components

import ToolBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.presentation.pages.ComponentListenAndRead.AnswerItem

@Composable
fun Part2AnswerScreen() {
    ToolBar()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {


        Spacer(modifier = Modifier.height(16.dp))

        // Second scrollable list
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            item {
                Text(
                    text = " 1-3 on your answer sheet.\n",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W400,
                )
                Text(
                    text = "Urban farming in Paris",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 24.sp
                )
                var userAnswer by remember { mutableStateOf("") }
                AnswerItem(
                    questionNumber = 1,
                    questionText = "Vertical tubes are used to grow strawberries, _______ and herbs.",
                    answerKey = "textanswer",
                    userAnswer = userAnswer,
                    onAnswerChange = { userAnswer = it }
                )
                AnswerItem(
                    questionNumber = 2,
                    questionText = "Vertical tubes are used to grow strawberries, _______ and herbs.",
                    answerKey = "textanswer",
                    userAnswer = userAnswer,
                    onAnswerChange = { userAnswer = it }
                )
                AnswerItem(
                    questionNumber = 3,
                    questionText = "Vertical tubes are used to grow strawberries, _______ and herbs.",
                    answerKey = "textanswer",
                    userAnswer = userAnswer,
                    onAnswerChange = { userAnswer = it }
                )
            }
        }
    }
}