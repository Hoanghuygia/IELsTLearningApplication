package com.example.ielstlearningapplication.presentation.pages.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.BottomBar

@Composable
fun ProfileScreen(navController: NavController){
    var bottomNavState by rememberSaveable { mutableStateOf(0) }

    fun changeProfileInfo() {
        navController.navigate(Route.HomeScreen.route)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(245, 245, 245))

    ){
        Row (
            modifier = Modifier.padding(horizontal = 18.dp, vertical = 26.dp)
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "Account",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0, 33, 71)
            )

            Image(
                modifier = Modifier
                    .size(28.dp)
                    .clickable(onClick = ::changeProfileInfo),
                painter = painterResource(R.drawable.mdi_pen),
                contentDescription = "Change Account Button")
        }

        Box(
            modifier = Modifier
                .height(210.dp)
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .size(width = 393.dp, height = 180.dp)
                ,
                painter = painterResource(R.drawable.profile_background),
                contentDescription = "Profile background"
            )

            Image(
                modifier = Modifier.size(120.dp).align(Alignment.BottomStart),
                painter = painterResource(R.drawable.profile_picture),
                contentDescription = "Profile picture"
            )
        }

        Column(
            modifier = Modifier.padding(horizontal = 18.dp, vertical = 4.dp).weight(1f)
        ) {
            Text(
                modifier = Modifier,
                text = "Nguyen Van A",
                fontSize = 24.sp,
                color = Color(0, 33, 71)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.gender_icon),
                    contentDescription = "Gender Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    Text(
                        modifier = Modifier,
                        text = "Female",
                        fontSize = 16.sp,
                        color = Color(0, 33, 71)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        modifier = Modifier,
                        text = "Gender",
                        fontSize = 12.sp,
                        color = Color(169, 169, 169)
                    )

                    HorizontalDivider(color = Color(169, 169, 169), thickness = 1.dp)
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.cake_icon),
                    contentDescription = "Birthday Date Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    Text(
                        modifier = Modifier,
                        text = "01/04/2000",
                        fontSize = 16.sp,
                        color = Color(0, 33, 71)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        modifier = Modifier,
                        text = "Birthday",
                        fontSize = 12.sp,
                        color = Color(169, 169, 169)
                    )

                    HorizontalDivider(color = Color(169, 169, 169), thickness = 1.dp)
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.gender_icon),
                    contentDescription = "Gender Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    Text(
                        modifier = Modifier,
                        text = "vana@gmail.com",
                        fontSize = 16.sp,
                        color = Color(0, 33, 71)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        modifier = Modifier,
                        text = "Email",
                        fontSize = 12.sp,
                        color = Color(169, 169, 169)
                    )

                    HorizontalDivider(color = Color(169, 169, 169), thickness = 1.dp)
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.gender_icon),
                    contentDescription = "Gender Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    Text(
                        modifier = Modifier,
                        text = "8.0",
                        fontSize = 16.sp,
                        color = Color(0, 33, 71)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        modifier = Modifier,
                        text = "Target",
                        fontSize = 12.sp,
                        color = Color(169, 169, 169)
                    )

                    HorizontalDivider(color = Color(169, 169, 169), thickness = 1.dp)
                }
            }
        }

        BottomBar(
            bottomNavState = bottomNavState,
            onNavItemClicked = {index -> bottomNavState = index}
        )
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        ProfileScreen(navController)
    }
}