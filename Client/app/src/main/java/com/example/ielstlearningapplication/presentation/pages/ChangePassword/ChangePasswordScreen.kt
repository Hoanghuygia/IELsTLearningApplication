package com.example.ielstlearningapplication.presentation.pages.ChangePassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route

@Composable
fun ChangePasswordScreen(navController: NavController) {
    var isInputNotNull1 by remember { mutableStateOf(false) }
    var isInputNotNull2 by remember { mutableStateOf(false) }
    var isInputNotNull3 by remember { mutableStateOf(false) }

    var currPw by remember { mutableStateOf("Enter your current password") }
    var newPW by remember { mutableStateOf("Enter your new password") }
    var confirmNew by remember { mutableStateOf("Confirm new password") }

    val openDialog = remember { mutableStateOf(false) }

    fun navigateBackToSetting() {
        navController.navigate(Route.SettingScreen.route)
    }

    Column(
        modifier = Modifier.padding(horizontal = 19.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .size(width = 393.dp, height = 50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(width = 12.dp, height = 30.dp)
                    .clickable(onClick = ::navigateBackToSetting),
                painter = painterResource(R.drawable.go_back_arrow),
                contentDescription = "Return to setting page"
            )

            Spacer(modifier = Modifier.size(40.dp))

            Text (
                modifier = Modifier,
                text = "Change Password",
                color = Color(0, 33, 71),
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(356.dp)
                .height(55.dp)
            ,
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            value = currPw,
            onValueChange = {
                isInputNotNull1 = true
                currPw = it },
            label = {
                Text(
                    text="Current Password",
                    fontSize = 14.sp,
                )
            },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(356.dp)
                .height(55.dp)
            ,
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            value = newPW,
            onValueChange = {
                isInputNotNull2 = true
                newPW = it },
            label = {
                Text(
                    text="New Password",
                    fontSize = 14.sp,
                )
            },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(356.dp)
                .height(55.dp)
            ,
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            value = confirmNew,
            onValueChange = {
                isInputNotNull3 = true
                confirmNew = it },
            label = {
                Text(
                    text="Current Password",
                    fontSize = 14.sp,
                )
            },
            shape = RoundedCornerShape(12.dp),
        )
        Spacer(modifier = Modifier.size(20.dp).weight(1f))

        Button(
            modifier = Modifier
                .height(60.dp)
                .width(357.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {openDialog.value = true},
            colors = ButtonColors(
                containerColor = Color(255, 215, 0),
                contentColor = Color(255, 255, 255),
                disabledContainerColor = Color(255, 215, 0),
                disabledContentColor = Color(255, 255, 255)
            ),
        ) {
            Text(
                text = "Change Password",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    if (openDialog.value) {
        Dialog (
            onDismissRequest = {
                openDialog.value = false
                navigateBackToSetting()
            }) {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
            ) {
                Text(
                    text = "Password change successfully",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChangePasswordScreenPreview() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        ChangePasswordScreen(navController)
    }
}