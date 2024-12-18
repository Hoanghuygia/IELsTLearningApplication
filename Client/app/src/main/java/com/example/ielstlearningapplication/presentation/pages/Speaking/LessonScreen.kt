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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
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
        },
    )
        { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
//                    .padding(16.dp)
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Spacer(modifier = Modifier.height(16.dp))
                    //question number
                    Text(
                        text = "0/10",
                        color = Color(0xFFA9A9A9),
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    //question
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "What is your favorite hobby?",
                        fontSize = 32.sp,
                        fontFamily = FontFamily.Default,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    //recording frame
//                    Spacer(modifier = Modifier.weight(1f))
                    Spacer(modifier = Modifier.height(200.dp))
                    Column(
                        modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .background(Color(0xFFE8E9EB), RoundedCornerShape(25.dp)),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            Text(
                                text = "0:00",
                                fontSize = 20.sp,
                                color = Color(0xFF002147),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .align(Alignment.TopCenter)
                            )
                            // Placeholder for waveform
                        }
                        //buttons
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .height(68.dp)
                                .padding(0.dp),
//                            .background(painter = painterResource(id = R.drawable.button_background), contentScale = ContentScale.Crop)
                            contentAlignment = Alignment.BottomCenter
                        ) {
//                        Box(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .height(68.dp)
//                                .padding(0.dp),
//                            contentAlignment = Alignment.CenterHorizontally
//                        ){
//
//                        }

                            Image(
                                painter = painterResource(id = R.drawable.button_background), // Thay bằng hình ảnh nền của bạn
                                contentDescription = null,
                                modifier = Modifier
                                    .height(68.dp)
                                    .padding(horizontal = 0.dp)
                                    .align(Alignment.BottomCenter)
                            )
                            Row(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(horizontal = 0.dp)
                                    .height(68.dp)
                                    .align(Alignment.Center)
                            ) {
                                Spacer(modifier = Modifier.width(5.dp))

                                // Phần bên trái: nút tròn
                                Box(
                                    modifier = Modifier
                                        .size(60.dp)
                                        .background(Color.White, shape = RoundedCornerShape(34.dp)),
                                    contentAlignment = Alignment.Center

                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Stop, // Thay bằng icon màu đỏ của bạn
                                        contentDescription = null,
                                        tint = Color(0xFFF42F4C),
                                        modifier = Modifier.size(30.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.weight(1f))

                                // Phần bên phải: nút tiến và lùi
                                Row {

                                    IconButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier
                                            .background(Color.White, shape = RoundedCornerShape(topStart = 50.dp, bottomStart = 50.dp))
                                            .width(100.dp)
                                            .height(60.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.ArrowBack,
                                            contentDescription = null,
                                            tint = Color(0xFFD9D9D9),
                                            modifier = Modifier.size(22.dp)
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(5.dp))

                                    IconButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier
                                            .background(Color.White, shape = RoundedCornerShape(topEnd = 50.dp, bottomEnd = 50.dp))
                                            .width(100.dp)
                                            .height(60.dp)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.ArrowForward,
                                            contentDescription = null,
                                            tint = Color(0xFF002147),
                                            modifier = Modifier.size(22.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(5.dp))
                            }
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
