//package com.example.ielstlearningapplication.presentation.pages.Reading.components

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
import com.example.ielstlearningapplication.presentation.pages.ComponentListenAndRead.QuestionItem

@Composable
fun ReadingAnswer() {
    ToolBar()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            item {
                Text(
                    text = "You should spend about 20 minutes on Questions 1-13, which are based on Reading Passage 1 below.\n",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W400,
                    lineHeight = 24.sp
                )
                Text(
                    text = "Urban Farming",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 24.sp
                )
                Text(
                    text = "In Paris, urban farmers are trying a soil-free approach to agriculture that uses less space and fewer resources. Could it help cities face the threats to our food supplies?\n" +
                            "On top of a striking new exhibition hall in southern Paris, the world’s largest urban rooftop farm has started to bear fruit. Strawberries that are small, intensely flavoured and resplendently red sprout abundantly from large plastic tubes. Peer inside and you see the tubes are completely hollow, the roots of dozens of strawberry plants dangling down inside them. From identical vertical tubes nearby burst row upon row of lettuces; near those",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W400,
                    lineHeight = 24.sp
                )
            }
        }



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
                QuestionItem(
                    questionNumber = 1,
                    questionText = "Vertical tubes are used to grow strawberries, _______ and herbs.",
                    answerKey = "textanswer",
                    userAnswer = userAnswer,
                    onAnswerChange = { userAnswer = it }
                )
                QuestionItem(
                    questionNumber = 2,
                    questionText = "Vertical tubes are used to grow strawberries, _______ and herbs.",
                    answerKey = "textanswer",
                    userAnswer = userAnswer,
                    onAnswerChange = { userAnswer = it }
                )
                QuestionItem(
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
