package com.example.ielstlearningapplication.presentation.pages.AIChat.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.presentation.pages.AIChat.data.Message
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun MessageComponent(message: Message, modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = if (message.entity == 1) {
                Color(0xFFFFE599)
            } else {
                Color(0xFF002147)
            }
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .padding(12.dp)
            .wrapContentSize()
    ) {
        Column(modifier.padding(top = 12.dp, start = 18.dp, end = 18.dp)) {
            Text(text = message.message)
            Text(
                text = message.time,
                color = Color.Gray,
                style = MaterialTheme.typography.displaySmall.copy(fontSize = 12.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessage() {
    IELsTLearningApplicationTheme {
        MessageComponent(Message(message = "ABC ILOV U", time = "1:29", entity = 0))
    }
}