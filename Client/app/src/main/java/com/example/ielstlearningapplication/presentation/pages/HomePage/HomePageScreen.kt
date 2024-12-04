package com.example.ielstlearningapplication.presentation.pages.HomePage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.BottomBar
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.ProfileHolder
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.user
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun HomePageScreen() {
    var bottomNavState by rememberSaveable { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomBar(
                bottomNavState = bottomNavState,
                onNavItemClicked = { index -> bottomNavState = index }
            )
        }
    ) { _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileHolder(user, modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .weight(4f)
                    .background(Color.Red)
            ) {
                Text(text = "Home Page screen")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomePageScreen() {
    IELsTLearningApplicationTheme {
        HomePageScreen()
    }
}


