package com.example.ielstlearningapplication.presentation.pages.Setting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route

@Composable
fun SettingScreen(navController: NavController) {
    var allowNotification by remember { mutableStateOf(false)}
    var isColorMode by remember { mutableStateOf(false)}

    fun navigatePasswordChange() {
        navController.navigate(Route.ChangePasswordScreen.route)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(255,255,255))
            .padding(vertical = 26.dp),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 19.dp),
            text = "Setting",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0, 33, 71)
        )

        Spacer(modifier = Modifier.size(20.dp))

        Row (
            modifier = Modifier
                .size(height = 56.dp, width = 393.dp)
                .fillMaxSize()
                .clickable(onClick = ::navigatePasswordChange),
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.size(width = 19.dp, height = 0.dp))

            Image(
                modifier = Modifier
                    .size(28.dp),
                painter = painterResource(R.drawable.key),
                contentDescription = "change password"
            )

            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = "Change password",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.size(10.dp))

        Row (
            modifier = Modifier
                .size(height = 56.dp, width = 393.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.size(width = 19.dp, height = 0.dp))

            Image(
                modifier = Modifier.size(28.dp),
                painter = painterResource(R.drawable.bell),
                contentDescription = "change password"
            )

            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = "Notify",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.size(width = 150.dp, height = 0.dp))

            Switch(
                modifier = Modifier.scale(1.5f),
                checked = allowNotification,
                onCheckedChange = {allowNotification = it}
            )
        }

        Spacer(modifier = Modifier.size(10.dp))

        Row (
            modifier = Modifier
                .size(height = 56.dp, width = 393.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.size(width = 19.dp, height = 0.dp))

            Image(
                modifier = Modifier.size(28.dp),
                painter = painterResource(R.drawable.dark),
                contentDescription = "change theme"
            )

            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = "Color Mode",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.size(width = 90.dp, height = 0.dp))

            Switch(
                modifier = Modifier.scale(1.5f),
                checked = isColorMode,
                onCheckedChange = {isColorMode = it}
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SettingScreenPreview() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        SettingScreen(navController)
    }
}
