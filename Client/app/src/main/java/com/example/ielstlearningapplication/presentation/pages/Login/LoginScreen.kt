package com.example.ielstlearningapplication.presentation.pages.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.Login.Components.InputField
import com.example.ielstlearningapplication.presentation.pages.Login.Components.LoginPageButton
import okhttp3.Route

@Composable
fun LoginScreen(navController: NavController, viewModel: LoginModel = LoginModel(), onFacebookLogin: () -> Unit = {},
                onGoogleLogin: () -> Unit = {}) {

    var userGmail by remember { mutableStateOf("") }
    var userPassword by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0, 33, 71)),
    ) {
        Column(
            modifier = Modifier
                .height(170.dp)
                .padding(horizontal = 40.dp, vertical = 30.dp),
        ) {
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

        Column(
            modifier = Modifier
                .height(265.dp)
                .background(Color.White, shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .padding(horizontal = 40.dp, vertical = 10.dp),
        ) {
            Text(
                text = "Login",
                fontSize = 40.sp,
                color = Color(0, 33, 71)
            )

            Spacer(modifier = Modifier.height(15.dp))

            InputField(
                fieldValue = userGmail,
                labelText = "Enter Your Email",
                onReceiveInput = { userGmail = it }
            )

            Spacer(modifier = Modifier.height(14.dp))

            InputField(
                fieldValue = userPassword,
                labelText = "Enter Your Password",
                onReceiveInput = { userPassword = it }
            )

            Spacer(modifier = Modifier.height(15.dp))

            errorMessage?.let {
                Text(
                    text = it,
                    color = Color.Red,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            LoginPageButton(
                buttonColors = ButtonColors(
                    containerColor = Color(255, 215, 0),
                    contentColor = Color(0, 33, 71),
                    disabledContainerColor = Color(255, 215, 0),
                    disabledContentColor = Color(0, 33, 71)
                ),
                buttonContent = "Login",
                onButtonClick = {
                    viewModel.signIn(
                        email = userGmail,
                        password = userPassword,
                        onSuccess = {
                            navController.navigate(Route.HomeScreen.route)
                        },
                        onError = { error ->
                            errorMessage = error
                        }
                    )
                },
                icon = null
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                modifier = Modifier,
                text = "Or with",
                fontSize = 18.sp,
                color = Color(0xD8000000)
            )

            Spacer(modifier = Modifier.height(20.dp))

            LoginPageButton(
                buttonColors = ButtonColors(
                    containerColor = Color(24, 119, 242),
                    contentColor = Color(230, 230, 230),
                    disabledContainerColor = Color(24, 119, 242),
                    disabledContentColor = Color(230, 230, 230)),
                buttonContent = "Continue with Facebook",
                icon = R.drawable.facebook_logo,
                onButtonClick = onFacebookLogin
            )

            Spacer(modifier = Modifier.height(15.dp))

            LoginPageButton (
                buttonColors = ButtonColors(
                    containerColor = Color(235,235,235),
                    contentColor = Color.Black.copy(alpha = 0.6f),
                    disabledContainerColor = Color(235,235,235),
                    disabledContentColor = Color.Black.copy(alpha = 0.6f)
                ),
                buttonContent = "Continue with Google",
                icon = R.drawable.google_logo,
                onButtonClick = onGoogleLogin
            )

            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Text(
                    text = "Don't have an account? ",
                    fontSize = 16.sp,
                    color = Color(13, 14, 14)
                )

                Text(
                    modifier = Modifier.clickable {
                        navController.navigate(Route.SignupScreen.route)
                    },
                    text = "Sign up",
                    fontSize = 16.sp,
                    color = Color(24, 119, 242)
                )
            }
        }
    }
}



//@Preview(showBackground = true)
//@Composable
//fun LoginScreenReview() {
//    IELsTLearningApplicationTheme {
//        val navController = rememberNavController()
//        LoginScreen(navController,{})
//    }
//}




