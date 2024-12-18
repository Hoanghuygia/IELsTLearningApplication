package com.example.ielstlearningapplication.presentation.pages.Speaking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.res.painterResource
import com.example.ielstlearningapplication.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpeakingResultScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lesson 1") },
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
    )
    { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.four_star),
                contentDescription = "Four Stars"
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Well done!",
                fontSize = 40.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Overall Score",
                fontSize = 32.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "80",
                fontSize = 180.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                onClick = { /* Handle button click */ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFD700)),
                modifier = Modifier
                    .width(277.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "Show Details",
                    color = Color.White
                )
            }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun PreviewSpeakingResultScreen() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        SpeakingResultScreen(navController)
    }
}