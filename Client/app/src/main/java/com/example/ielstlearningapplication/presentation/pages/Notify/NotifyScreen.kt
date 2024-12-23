package com.example.ielstlearningapplication.presentation.pages.Notify

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.HomePage.components.BottomBar
import com.example.ielstlearningapplication.presentation.pages.Listening.components.TabBar
import com.example.ielstlearningapplication.presentation.pages.Notify.components.NotifyItem
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme



@Composable
fun NotifyScreen() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 0.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)

        ) {
            Text(
                text = "Notify",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            NotifyContent()

        }
    }

@Preview(showBackground = true)
@Composable
fun PreviewNotifyScreen() {
    IELsTLearningApplicationTheme {
        NotifyScreen()
    }
}
