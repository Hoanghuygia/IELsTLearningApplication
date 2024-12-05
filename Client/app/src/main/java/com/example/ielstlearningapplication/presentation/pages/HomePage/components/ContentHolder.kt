package com.example.ielstlearningapplication.presentation.pages.HomePage.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.HomeScreenData
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.HomeScrenItem
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun ContentHolder(
    firstHomeScreenItem: HomeScrenItem,
    secondHomeScreenItem: HomeScrenItem,
    modifier: Modifier,
    navController: NavController
) {
    Row(modifier = modifier.fillMaxWidth()) {
        SubContentHolder(
            firstHomeScreenItem,
            onEvent = {navigateScreenByRoute(navController, firstHomeScreenItem.route)},
            modifier = Modifier
                .weight(1f)
                .padding(end = 12.dp)
        )
        SubContentHolder(
            secondHomeScreenItem,
            onEvent = {navigateScreenByRoute(navController, secondHomeScreenItem.route)},
            modifier = Modifier
                .weight(1f)
                .padding(start = 12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewContentHolder() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        ContentHolder(
            HomeScreenData.homePageItem[0],
            HomeScreenData.homePageItem[1],
            modifier = Modifier,
            navController = navController
        )
    }
}

fun navigateScreenByRoute(navController: NavController ,route: String){
//    when(route){
//        "onReadingScreen" -> {
//            navController.navigate(route)
//        }
//        "onListeningScreen" -> {
//            navController.navigate(route)
//        }
//
//    }
    navController.navigate(route)
}
