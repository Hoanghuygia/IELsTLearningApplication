package com.example.ielstlearningapplication.presentation.pages.HomePage.components

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.HomeScreenData.screens

@Composable
fun BottomBar(
    bottomNavState: Int,
    onNavItemClicked: (Int) -> Unit
) {
    NavigationBar {
        screens.forEachIndexed { index, screen ->
            NavigationBarItem(
                selected = bottomNavState == index,
                onClick = { onNavItemClicked(index) },
                icon = {
                    BadgedBox(badge = {

                        if (screen.hasBadge) Badge {}
                        if (screen.badgeNum != 0) {
                            Badge {
                                Text(text = screen.badgeNum.toString())
                            }
                        }
                    }) {
                        Icon(
                            imageVector = if (bottomNavState == index) {
                                screen.iconFilled
                            } else {
                                screen.iconOutlined
                            },
                            contentDescription = screen.title
                        )
                    }
                },
                label = { Text(text = screen.title) }
            )
        }
    }
}