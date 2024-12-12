package com.example.buildprojectwithcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListeningTestScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Practice", "Comment")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Cambridge IELTS 16 Academic \n" +
                                "Reading - Test 1"
                    )
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
        },
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
                0 -> PracticeListeningScreen()
                1 -> CommentListeningScreen()
            }
        }
    }
}

@Composable
fun PracticeListeningScreen() {
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
            onClick = { /* Handle practice click */ },
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommentListeningScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Input comment field
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = "",
                onValueChange = { /* Handle text input */ },
                placeholder = { Text("Leave a comment...") },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF5F5F5)
                )
            )
            IconButton(onClick = { /* Handle send comment */ }) {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "Send",
                    tint = Color(0xFF002147)
                )
            }
        }

        // Comment list
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(5) { // Fake 10 comments for now
                ListeningCommentItem(
                    username = "account 1",
                    comment = "Chúc mừng đạt AIM nhé",
                    timeAgo = "21 hour"
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { /* Handle see more click */ },
                modifier = Modifier
                    .width(203.dp)
                    .height(44.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color(0xFF002147)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "See more",
                    color = Color(0xFF002147),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W400,
                    lineHeight = 24.sp
                )
            }
        }
    }
}

@Composable
fun ListeningCommentItem(username: String, comment: String, timeAgo: String) {
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
                Text(
                    text = "Like",
                    style = TextStyle(fontSize = 12.sp, color = Color.Blue)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Reply",
                    style = TextStyle(fontSize = 12.sp, color = Color.Blue)
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun ListeningTestScreenPreview() {
    ReadingTestScreen()
}
