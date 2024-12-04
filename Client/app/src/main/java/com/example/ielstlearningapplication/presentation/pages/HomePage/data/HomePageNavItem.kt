package com.example.ielstlearningapplication.presentation.pages.HomePage.data

import androidx.compose.ui.graphics.vector.ImageVector

public data class HomePageNavItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: String,
    val hasBadge: Boolean,
    val badgeNum: Number
)
