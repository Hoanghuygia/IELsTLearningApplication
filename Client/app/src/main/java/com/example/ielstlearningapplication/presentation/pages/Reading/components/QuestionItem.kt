package com.example.ielstlearningapplication.presentation.pages.Reading.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionItem(
    questionNumber: Int,
    questionText: String,
    answerKey: String,
    userAnswer: String,
    onAnswerChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Question number and text
        Text(
            text = "$questionNumber. $questionText",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W400
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Answer input box
        TextField(
            value = userAnswer,
            onValueChange = onAnswerChange,
            placeholder = { Text("Textbox") },
            modifier = Modifier
                .height(50.dp)
                .width(174.dp)
                .padding(vertical = 0.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFFFC1C1), // Light pink background
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(12.dp)
        )


        Spacer(modifier = Modifier.height(8.dp))

        // Answer key
        Text(
            text = "Answer key: $answerKey",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color(0xFF007F00) // Green color for answer key
            )
        )
    }
}