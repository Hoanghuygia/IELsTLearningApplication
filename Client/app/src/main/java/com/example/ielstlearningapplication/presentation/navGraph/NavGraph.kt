package com.example.ielstlearningapplication.presentation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.ielstlearningapplication.presentation.pages.HomePage.HomePageScreen
import com.example.ielstlearningapplication.presentation.pages.Login.LoginScreen
import com.example.ielstlearningapplication.presentation.pages.Profile.ProfileScreen

@Composable
fun NavGraph(startDestination: String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        // Login Screen
        composable(route = Route.LoginScreen.route) {
            LoginScreen(
                onEvent = {
                    navController.navigate(Route.HomeScreen.route)
                }
            )
        }

        composable(route = Route.HomeScreen.route) {
            HomePageScreen(
                navController = navController
            )
        }

        composable(route = Route.ProfileScreen.route){
            ProfileScreen()
        }
    }
}
