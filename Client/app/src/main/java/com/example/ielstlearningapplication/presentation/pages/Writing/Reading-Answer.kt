package com.example.buildprojectwithcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.buildprojectwithcompose.ui.theme.BuildProjectWithComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingAnswerScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Passage 1", "Passage 2", "Passage 3")
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
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
                0 -> Passage1Screen()
                1 -> Passage2Screen()
                2 -> Passage3Screen()
            }
        }
    }
}

@Composable
fun BottomBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Hiển thị thời gian
        Text(
            text = "00:00",
            fontSize = 32.sp,
            color = Color.Black,
            style = TextStyle(fontWeight = W400) // Assuming you want a bold style
        )


        // Biểu tượng
        Row {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp)) // Khoảng cách giữa các icon
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Translate",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Delete",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}


@Composable
fun Passage1Screen() {
    BottomBar()
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


@Composable
fun Passage2Screen() {
    // Placeholder content for Task 2
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Task 2 content goes here.")
    }
}

@Composable
fun Passage3Screen() {
    // Placeholder content for Task 2
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Task 2 content goes here.")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ReadingAnswerScreenPreview() {
//    BuildProjectWithComposeTheme {
//        ReadingAnswerScreen()
//    }
//}
