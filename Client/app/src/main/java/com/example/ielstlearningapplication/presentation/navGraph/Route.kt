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

    //reading
    object ReadingTestScreen: Route(route = "onReadingTestScreen")
    object ReadingAnswerScreen: Route(route = "onReadingAnswerScreen")
    object ReadingDoingTestScreen: Route(route = "onReadingDoingTestScreen")

    //listening
    object ListeningDoingTestScreen: Route(route = "onListeningDoingTestScreen")
    object ListeningTestScreen: Route(route = "onListeningTestScreen")
    object ListeningAnswerScreen: Route(route = "onListeningAnswerScreen")

    //speaking
    object SpeakingResultScreen: Route(route = "onSpeakingResultScreen")





    object ProfileChangeScreen: Route(route = "onProfileChangeScreen")
    object SettingScreen: Route(route = "onSettingScreen")
    object ChangePasswordScreen: Route(route = "onChangePasswordScreen")
    object CreateNewWordScreen : Route(route = "onCreateNewWordScreen")
}