package com.example.ielstlearningapplication.presentation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.HomePageScreen
import com.example.ielstlearningapplication.presentation.pages.Login.LoginScreen

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

        // Home Screen
        composable(route = Route.HomeScreen.route) {
            HomePageScreen()
        }
    }
}
