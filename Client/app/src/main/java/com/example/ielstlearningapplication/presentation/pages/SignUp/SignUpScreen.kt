package com.example.ielstlearningapplication.presentation.pages.SignUp

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
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.Login.LoginScreen

@Composable
fun SignUpScreen(navController: NavController, onEvent : () -> Unit) {
    var userName by remember { mutableStateOf("") }
    var userGmail by remember { mutableStateOf("") }
    var userPhone by remember { mutableStateOf("") }
    var userPassword by remember { mutableStateOf("") }

    fun navigateLogin() {
        navController.navigate(Route.LoginScreen.route)
    }


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0, 33, 71)),
    ){
        Column (
            modifier = Modifier.height(40.dp)
        ){}
        Column(
            modifier = Modifier
                .height(385.dp)
                .background(Color.White,
                    shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                )
                .padding(horizontal = 40.dp, vertical = 15.dp),
        ){
            Text(
                text = "Sign up",
                fontSize = 40.sp,
                color = Color(0, 33, 71)
            )

            Spacer(modifier = Modifier.height(25.dp))

            OutlinedTextField(
                modifier = Modifier
                    .width(312.dp)
                    .height(55.dp)
                ,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                value = userName,
                onValueChange = {userName = it},
                label = {
                    Text(text="Enter Your Email")
                }
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

            Spacer(modifier = Modifier.height(24.dp))

            OutlinedTextField(
                modifier = Modifier
                    .width(312.dp)
                    .height(55.dp)
                ,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                value = userPhone,
                onValueChange = {userPhone = it},
                label = {
                    Text(text="Enter Your Email")
                }
            )

            Spacer(modifier = Modifier.height(24.dp))

            OutlinedTextField(
                modifier = Modifier
                    .width(312.dp)
                    .height(55.dp)
                ,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                value = userPassword,
                onValueChange = {userPassword = it},
                label = {
                    Text(text="Enter Your Email")
                }
            )
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
                    text = "Sign up",
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                modifier = Modifier,
                text = "Or with",
                fontSize = 18.sp,
                color = Color(0xD8000000)
            )

            Spacer(modifier = Modifier.height(20.dp))

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
                    text = "Already have an account? ",
                    fontSize = 16.sp,
                    color = Color(13, 14, 14)
                )

                Text(
                    modifier = Modifier.clickable (onClick = ::navigateLogin),
                    text = "Sign in",
                    fontSize = 16.sp,
                    color = Color(24, 119, 242)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenReview() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        SignUpScreen(navController,{})
    }
}