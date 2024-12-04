package com.example.ielstlearningapplication.presentation.pages.HomePage.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
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
            badgeNum = 10
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
}