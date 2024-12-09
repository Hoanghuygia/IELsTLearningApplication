package com.example.ielstlearningapplication.presentation.pages.HomePage.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Draw
import androidx.compose.material.icons.filled.Forum
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.outlined.Headphones
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ImportContacts
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material.icons.outlined.Draw
import androidx.compose.material.icons.outlined.Forum
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ImportContacts
import androidx.compose.material.icons.outlined.Mic
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
//import androidx.compose.material.icons.filled.Stylus
//import androidx.compose.material.icons.outlined.Stylus
import com.example.ielstlearningapplication.presentation.navGraph.Route

object HomeScreenData {
    val screens = listOf(
        HomePageNavItem(
            title = "Home",
            Icons.Filled.Home,
            Icons.Outlined.Home,
            Route.HomeScreen.route,
            hasBadge = false,
            badgeNum = 0
        ),
        HomePageNavItem(
            title = "My Words",
            Icons.Filled.Book,
            Icons.Outlined.Book,
            Route.HomeScreen.route,
            hasBadge = false,
            badgeNum = 0
        ),
        HomePageNavItem(
            title = "Notify",
            Icons.Filled.Notifications,
            Icons.Outlined.Notifications,
            Route.HomeScreen.route,
            hasBadge = true,
            badgeNum = 0,

        ),
        HomePageNavItem(
            title = "Account",
            Icons.Filled.Person,
            Icons.Outlined.Person,
            Route.HomeScreen.route,
            hasBadge = false,
            badgeNum = 0
        ),
        HomePageNavItem(
            title = "Setting",
            Icons.Filled.Settings,
            Icons.Outlined.Settings,
            Route.HomeScreen.route,
            hasBadge = false,
            badgeNum = 0
        )
    )
    val homePageItem = listOf(
        HomeScrenItem(
            title = "Read",
            iconFocus = Icons.Filled.ImportContacts,
            iconNormal = Icons.Outlined.ImportContacts,
            route = "onReadingScreen"
        ),
        HomeScrenItem(
            title = "Listen",
            iconFocus = Icons.Filled.Headphones,
            iconNormal = Icons.Outlined.Headphones,
            route = "onListeningScreen"
        ),
        HomeScrenItem(
            title = "Write",
            iconFocus = Icons.Filled.Draw,
            iconNormal = Icons.Outlined.Draw,
            route = "onWritingScreen"
        ),
        HomeScrenItem(
            title = "Speak",
            iconFocus = Icons.Filled.Mic,
            iconNormal = Icons.Outlined.Mic,
            route = "onSpeakingScreen"
        ),
        HomeScrenItem(
            title = "My words",
            iconFocus = Icons.Filled.Book,
            iconNormal = Icons.Outlined.Book,
            route = "onLibraryScreen"
        ),
        HomeScrenItem(
            title = "Chat with AI",
            iconFocus = Icons.Filled.Forum,
            iconNormal = Icons.Outlined.Forum,
            route = "onAIScreen"
        ),
    )
}
