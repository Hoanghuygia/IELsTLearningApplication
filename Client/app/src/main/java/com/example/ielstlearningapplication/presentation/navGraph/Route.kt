package com.example.ielstlearningapplication.presentation.navGraph

sealed class Route(
    val route: String
) {
    object HomeScreen: Route(route = "onHomeScreen")
    object LoginScreen: Route(route = "onLoginScreen")
    object SignupScreen: Route(route = "onSignupScreen")
    object ProfileScreen: Route(route = "onProfileScreen")
    object ReadingScreen: Route(route = "onReadingScreen")
    object ListeningScreen: Route(route = "onListeningScreen")
    object WritingScreen: Route(route = "onWritingScreen")
    object SpeakingScreen: Route(route = "onSpeakingScreen")
    object LibraryScreen: Route(route = "onLibraryScreen")
    object AIScreen: Route(route = "onAIScreen")
    object NotifyScreen: Route(route = "onNotifyScreen")
}