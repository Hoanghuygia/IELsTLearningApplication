package com.example.ielstlearningapplication.presentation.pages.Speaking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Stop
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.pages.Speaking.components.SpeakingButtons
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun LessonScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Hobbies", color = Color(0xFF002147), fontSize = 20.sp) },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back navigation */ }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                backgroundColor = Color.White
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Header Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "0/10",
                        color = Color(0xFFA9A9A9),
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Default,
                        textAlign = TextAlign.Center,
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "1. What is your favorite hobby?",
                        fontSize = 32.sp,
                        fontFamily = FontFamily.Default,
                        color = Color.Black,
                    )
                }
            }
            SpeakingButtons()


        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLessonScreen() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        LessonScreen(navController)
    }
}
