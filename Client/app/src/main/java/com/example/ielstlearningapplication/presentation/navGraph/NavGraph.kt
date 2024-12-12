package com.example.ielstlearningapplication.presentation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.ielstlearningapplication.presentation.pages.AIChat.AIChatScreen
import com.example.ielstlearningapplication.presentation.pages.HomePage.HomePageScreen
import com.example.ielstlearningapplication.presentation.pages.Library.LibraryScreen
import com.example.ielstlearningapplication.presentation.pages.Listening.ListeningScreen
import com.example.ielstlearningapplication.presentation.pages.Login.LoginScreen
import com.example.ielstlearningapplication.presentation.pages.Notify.NotifyScreen
import com.example.ielstlearningapplication.presentation.pages.Profile.ProfileScreen
import com.example.ielstlearningapplication.presentation.pages.Writing.WritingScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.ReadingScreen
import com.example.ielstlearningapplication.presentation.pages.Speaking.SpeakingResultScreen
import com.example.ielstlearningapplication.presentation.pages.Speaking.SpeakingScreen

@Composable
fun NavGraph(startDestination: String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
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

        composable(route = Route.ReadingScreen.route){
            ReadingScreen()
        }

        composable(route = Route.ListeningScreen.route){
            ListeningScreen()
        }

        composable(route = Route.WritingScreen.route){
            WritingScreen()
        }

        composable(route = Route.SpeakingScreen.route){
            SpeakingScreen(navController)
        }

        composable(route = Route.LibraryScreen.route){
            LibraryScreen()
        }

        composable(route = Route.AIScreen.route){
            AIChatScreen()
        }
        composable(route = Route.NotifyScreen.route) {
            NotifyScreen()
        }
        composable(route = "speaking_result_screen") {
            SpeakingResultScreen()
        }
    }
}
