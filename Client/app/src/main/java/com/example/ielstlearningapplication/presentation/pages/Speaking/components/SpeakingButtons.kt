package com.example.ielstlearningapplication.presentation.pages.Speaking.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ielstlearningapplication.R

@Composable
fun SpeakingButtons() {
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
                var isMicrophoneOn by remember { mutableStateOf(true) }
                var isPause by remember { mutableStateOf(true) }

                // Nút tròn màu trắng (Stop)
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color.White, RoundedCornerShape(30.dp))
                        .padding(0.dp),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        onClick = { isMicrophoneOn = !isMicrophoneOn },
                        modifier = Modifier.size(60.dp)
                    ) {
                        if (isMicrophoneOn) {
                            Icon(
                                painter = painterResource(id = R.drawable.mic),
                                contentDescription = null,
                                tint = Color(0xFFF42F4C),
                                modifier = Modifier.size(30.dp)
                            )



                        } else {
                            Icon(
                                imageVector = Icons.Default.Stop,
                                contentDescription = null,
                                tint = Color(0xFFF42F4C),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(1f))


                if (isMicrophoneOn) {
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
                } else {
                    // Nút không có icon với kích thước 210 dp
                    IconButton(
                        onClick = { isPause = !isPause },
                        modifier = Modifier
                            .background(Color.White, shape = RoundedCornerShape(30.dp))
                            .width(210.dp)  // Mở rộng nút
                            .height(60.dp)
                            .padding(horizontal = 0.dp)
                    ) {
                        if(isPause){
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = null,
                                tint = Color(0xFF002147),
                                modifier = Modifier.size(22.dp)
                            )
                        }else{
                            Icon(
                                painter = painterResource(id = R.drawable.play),
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