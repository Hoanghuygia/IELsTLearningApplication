package com.example.ielstlearningapplication.presentation.navGraph

sealed class Route(
    val route: String
) {
    object HomeScreen: Route(route = "onHomeScreen")
    object LoginScreen: Route(route = "onLoginScreen")
    object SignupScreen: Route(route = "onSignupScreen")
    object ReadingScreen: Route(route = "onReadingScreen")
    object WritingScreen: Route(route = "onWritingScreen")
    object SpeakingScreen: Route(route = "onSpeakingScreen")
    object ListeningScreen: Route(route = "onListeningScreen")
    object ProfileScreen: Route(route = "onProfileScreen")
}