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

            // Main Content Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp) // Tổng chiều cao của container
            ) {
                // Box chứa thời gian và các nút
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(Color(0xFFE8E9EB), RoundedCornerShape(25.dp)),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Text(
                        text = "0:00",
                        fontSize = 20.sp,
                        color = Color(0xFF002147),
                        modifier = Modifier
                            .padding(top = 16.dp)
                    )
                }

                // Nút điều khiển
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp)
                        .align(Alignment.BottomCenter),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.button_background),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(68.dp)
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 0.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Spacer(modifier = Modifier.width(5.dp))

                        // Nút tròn màu trắng (Stop)
                        Box(
                            modifier = Modifier
                                .size(60.dp)
                                .background(Color.White, RoundedCornerShape(30.dp))
                                .padding(0.dp),

                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Stop,
                                contentDescription = null,
                                tint = Color(0xFFF42F4C),
                                modifier = Modifier.size(30.dp)
                            )
                        }
//                        Spacer(modifier = Modifier.fillMaxSize())
                        Spacer(modifier = Modifier.weight(1f))
                        // Nút lùi
                        IconButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .background(Color.White, shape = RoundedCornerShape(topStart = 50.dp, bottomStart = 50.dp))
                                .width(100.dp)
                                .height(60.dp)
                                .padding(horizontal = 0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = null,
                                tint = Color(0xFFD9D9D9),
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        // Nút tiến
                        IconButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .background(Color.White, shape = RoundedCornerShape(topEnd = 50.dp, bottomEnd = 50.dp))
                                .width(100.dp)
                                .height(60.dp)
                                .padding(horizontal = 0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowForward,
                                contentDescription = null,
                                tint = Color(0xFF002147),
                                modifier = Modifier.size(22.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(5.dp))

                    }
                }
            }
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
