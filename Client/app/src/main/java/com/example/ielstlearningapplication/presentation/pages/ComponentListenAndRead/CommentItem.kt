package com.example.ielstlearningapplication.presentation.pages.ComponentListenAndRead

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommentItem(username: String, comment: String, timeAgo: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.Top
    ) {
        // User avatar
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.LightGray) // Placeholder for avatar
        ) {
            // Replace with Image if available
        }

        Spacer(modifier = Modifier.width(8.dp))

        // Comment details
        Column {
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFFD9D9D9), // Light gray border color
                        shape = RoundedCornerShape(8.dp) // Rounded corners
                    )
                    .padding(8.dp)
            ) {
                Column {
                    Text(
                        text = username,
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                    )
                    Text(
                        text = comment,
                        style = TextStyle(fontSize = 14.sp)
                    )
                }
            }
            Row(
                modifier = Modifier.padding(top = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = timeAgo,
                    style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                )
                Spacer(modifier = Modifier.width(16.dp))
                TextButton(
                    onClick = { /* Handle Like action */ },
                    modifier = Modifier.padding(4.dp)
                ) {
                    Text(
                        text = "Like",
                        style = TextStyle(fontSize = 12.sp, color = Color.Blue)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                TextButton(
                    onClick = { /* Handle Reply action */ },
                    modifier = Modifier.padding(4.dp)
                ) {
                    Text(
                        text = "Reply",
                        style = TextStyle(fontSize = 12.sp, color = Color.Blue)
                    )
                }
            }
        }

    }
}

