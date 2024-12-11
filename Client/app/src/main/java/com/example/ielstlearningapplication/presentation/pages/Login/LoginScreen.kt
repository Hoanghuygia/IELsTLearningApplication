package com.example.ielstlearningapplication.presentation.pages.Login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R

@Composable
fun LoginScreen(onEvent: () -> Unit) {
    var checked by remember { mutableStateOf(false) }
    var userGmail by remember { mutableStateOf("")}
    var userPassword by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0, 33, 71)),
    ) {
        Column(
            modifier = Modifier
                .height(213.dp)
                .padding(horizontal = 40.dp, vertical = 50.dp),

        ){
            Text(
                text = "Welcome to",
                color = Color.White,
                fontSize = 32.sp,
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "PeakIELTS!",
                color = Color.White,
                fontSize = 64.sp,
            )
        }

        Column (
            modifier = Modifier
                .height(280.dp)
                .background(Color.White,
                    shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                )
                .padding(horizontal = 40.dp, vertical = 25.dp),
        ){
            Text(
                text = "Login",
                fontSize = 40.sp,
                color = Color(0, 33, 71)
            )

            Spacer(modifier = Modifier.height(24.dp))

            OutlinedTextField(
                modifier = Modifier
                    .width(312.dp)
                    .height(55.dp)
                ,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                value = userGmail,
                onValueChange = {userGmail = it},
                label = {
                    Text(text="Enter Your Email")
                }
                )

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedTextField(
                modifier = Modifier
                    .width(312.dp)
                    .height(55.dp)
                ,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                value = userPassword,
                onValueChange = {userPassword = it},
                label = {
                    Text(text="Enter Your Password")
                }
            )

            Spacer(modifier = Modifier.height(15.dp))
            Row (
                modifier = Modifier
                    .height(43.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(

                    checked = checked,
                    onCheckedChange = {checked = it}
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Remember me",
                    fontSize = 15.sp,
                    color = Color(0, 12, 20),
                )

                Text(
                    text = "Forgot Password?",
                    fontSize = 15.sp,
                    color = Color(232,105,105),
                )
            }
        }

        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(horizontal = 40.dp, vertical = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Button(
                modifier = Modifier
                    .height(48.dp)
                    .width(312.dp),
                onClick = onEvent,
                colors = ButtonColors(
                    containerColor = Color(255, 215, 0),
                    contentColor = Color(0, 33, 71),
                    disabledContainerColor = Color(255, 215, 0),
                    disabledContentColor = Color(0, 33, 71)
                )
            ) {
                Text(
                    text = "Login",
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                modifier = Modifier,
                text = "Or with",
                fontSize = 18.sp,
                color = Color(0xD8000000)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                modifier = Modifier
                    .height(48.dp)
                    .width(312.dp),
                onClick = onEvent,
                colors = ButtonColors(
                    containerColor = Color(24, 119, 242),
                    contentColor = Color(230, 230, 230),
                    disabledContainerColor = Color(24, 119, 242),
                    disabledContentColor = Color(230, 230, 230)
                ),
            ) {
                Image(
                    modifier = Modifier
                        .size(26.dp)
                    ,
                    painter = painterResource(id = R.drawable.facebook_logo),
                    contentDescription = "Facebook logo"
                )
                Text(
                    modifier = Modifier.padding(horizontal = 30.dp),
                    text = "Continue with Facebook",
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                modifier = Modifier
                    .height(48.dp)
                    .width(312.dp),
                onClick = onEvent,
                colors = ButtonColors(
                    containerColor = Color(235,235,235),
                    contentColor = Color.Black.copy(alpha = 0.6f),
                    disabledContainerColor = Color(235,235,235),
                    disabledContentColor = Color.Black.copy(alpha = 0.6f)
                ),
            ) {
                Image(
                    modifier = Modifier
                        .size(26.dp)
                    ,
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "Facebook logo"
                )
                Text(
                    modifier = Modifier.padding(horizontal = 30.dp),
                    text = "Continue with Google",
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Text(
                    text = "Don't have an account? ",
                    fontSize = 16.sp,
                    color = Color(13, 14, 14)
                )

                Text(
                    modifier = Modifier.clickable {

                    },
                    text = "Sign up",
                    fontSize = 16.sp,
                    color = Color(24, 119, 242)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenReview() {
    IELsTLearningApplicationTheme {
        LoginScreen({})
    }
}


