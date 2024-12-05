package com.example.ielstlearningapplication.presentation.pages.HomePage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.BottomBar
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.ContentHolder
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.ProfileHolder
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.HomeScreenData
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.user
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun HomePageScreen(navController: NavController) {
    var bottomNavState by rememberSaveable { mutableStateOf(0) }

    fun navigateProfile() {
        navController.navigate(Route.ProfileScreen.route)
    }

    Scaffold(
        bottomBar = {
            BottomBar(
                bottomNavState = bottomNavState,
                onNavItemClicked = { index -> bottomNavState = index }
            )
        }
    ) { _ ->
        when (bottomNavState) {
            0 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(start = 32.dp, end = 32.dp, top = 50.dp),
                    verticalArrangement = Arrangement.spacedBy(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ProfileHolder(user, modifier = Modifier, onEvent = ::navigateProfile)

                    val homePageItemLength = HomeScreenData.homePageItem.size
                    if (homePageItemLength % 2 == 0) {
                        for (i in 0 until homePageItemLength - 1 step 2) {
                            val first = HomeScreenData.homePageItem[i]
                            val second = HomeScreenData.homePageItem[i + 1]
                            ContentHolder(first, second, modifier = Modifier)
                        }
                    }
                }
            }
            else -> {
                Text(text = HomeScreenData.screens[bottomNavState].title)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomePageScreen() {
    IELsTLearningApplicationTheme {
//        HomePageScreen()
    }
}



