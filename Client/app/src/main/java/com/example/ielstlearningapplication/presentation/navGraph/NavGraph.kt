package com.example.ielstlearningapplication.presentation.navGraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.buildprojectwithcompose.ListeningTestScreen
import com.example.buildprojectwithcompose.ReadingDoingTestScreen
//import com.example.buildprojectwithcompose.ReadingAnswerScreen
import com.example.buildprojectwithcompose.ReadingTestScreen
import com.example.ielstlearningapplication.presentation.pages.AIChat.AIChatScreen
import com.example.ielstlearningapplication.presentation.pages.ChangePassword.ChangePasswordScreen
import com.example.ielstlearningapplication.presentation.pages.CreateNewWord.CreateNewWordScreen
import com.example.ielstlearningapplication.presentation.pages.HomePage.HomePageScreen
import com.example.ielstlearningapplication.presentation.pages.Library.LibraryScreen
import com.example.ielstlearningapplication.presentation.pages.Listening.ListeningDoingTestScreen
import com.example.ielstlearningapplication.presentation.pages.Listening.ListeningScreen
import com.example.ielstlearningapplication.presentation.pages.Listening.ListeningAnswerScreen
import com.example.ielstlearningapplication.presentation.pages.Login.LoginModel
import com.example.ielstlearningapplication.presentation.pages.Login.LoginScreen
import com.example.ielstlearningapplication.presentation.pages.Notify.NotifyScreen
import com.example.ielstlearningapplication.presentation.pages.Profile.ProfileScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.ReadingAnswerScreen
import com.example.ielstlearningapplication.presentation.pages.ProfileChange.ProfileChangeScreen
import com.example.ielstlearningapplication.presentation.pages.Writing.WritingScreen
import com.example.ielstlearningapplication.presentation.pages.Reading.ReadingScreen
import com.example.ielstlearningapplication.presentation.pages.Setting.SettingScreen
import com.example.ielstlearningapplication.presentation.pages.SignUp.SignUpModel
import com.example.ielstlearningapplication.presentation.pages.SignUp.SignUpScreen
import com.example.ielstlearningapplication.presentation.pages.Speaking.SpeakingScreen
import com.example.ielstlearningapplication.presentation.pages.Speaking.SpeakingResultScreen
import com.example.ielstlearningapplication.presentation.pages.Speaking.LessonScreen




@Composable
fun NavGraph(startDestination: String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
//        composable(route = Route.LoginScreen.route) {
//            LoginScreen(
//                navController = navController,
//                onEvent = {
//                    navController.navigate(Route.HomeScreen.route)
//                }
//            )
//        }

        composable(route = Route.LoginScreen.route) {
            val viewModel: LoginModel = hiltViewModel()
            LoginScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

//        composable(route = Route.SignupScreen.route) {
//            SignUpScreen(
//                navController = navController,
//                onEvent = {
//                    navController.navigate(Route.LoginScreen.route)
//                }
//            )
//        }

        composable(route = Route.SignupScreen.route) {
            val viewModel = SignUpModel()
            SignUpScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(route = Route.HomeScreen.route) {
            HomePageScreen(
                navController = navController
            )
        }

        composable(route = Route.ProfileScreen.route){
            ProfileScreen(
                navController = navController
            )
        }

        composable(route = Route.ReadingScreen.route){
            ReadingScreen(navController = navController)
        }

        composable(route = Route.ListeningScreen.route){
            ListeningScreen(navController = navController)
        }

        composable(route = Route.WritingScreen.route){
            WritingScreen()
        }

        composable(route = Route.SpeakingScreen.route){
            SpeakingScreen(navController = navController)
        }

        composable(route = Route.LibraryScreen.route){
            LibraryScreen(
                navController = navController
            )
        }

        composable(route = Route.AIScreen.route){
            AIChatScreen(navController = navController)
        }
        composable(route = Route.NotifyScreen.route) {
            NotifyScreen()
        }
        composable(route = Route.ProfileChangeScreen.route) {
            ProfileChangeScreen(
                navController = navController
            )
        }
        composable (route = Route.SettingScreen.route) {
            SettingScreen(
                navController = navController
            )
        }
        composable(route = Route.ChangePasswordScreen.route){
            ChangePasswordScreen(
                navController = navController
            )
        }
        composable(route = Route.CreateNewWordScreen.route) {
            CreateNewWordScreen(
                navController = navController
            )
        }
//        composable(route = Route.NotifyScreen.route) {
//            NotifyScreen()
//        }
        //-----------Reading-------------------------------------------------------
        composable(route = Route.ReadingTestScreen.route) {
            ReadingTestScreen(navController = navController)
        }
        composable(route = Route.ReadingDoingTestScreen.route) {
            ReadingDoingTestScreen(navController = navController)
        }
        composable(route = Route.ReadingAnswerScreen.route) {
            ReadingAnswerScreen(navController = navController)
        }


        //-----------Listening----------------------------------------------------------
        composable(route = Route.ListeningDoingTestScreen.route) {
            ListeningDoingTestScreen(navController = navController)
        }
        composable(route = Route.ListeningTestScreen.route) {
            ListeningTestScreen(navController = navController)
        }
        composable(route = Route.ListeningAnswerScreen.route) {
            ListeningAnswerScreen(navController = navController)
        }
        //-----------Speaking----------------------------------------------------------

        composable(route = Route.SpeakingResultScreen.route) {
            SpeakingResultScreen(navController = navController)
        }
        composable(route = Route.LessonScreen.route) {
            LessonScreen(navController = navController)
        }

    }
}