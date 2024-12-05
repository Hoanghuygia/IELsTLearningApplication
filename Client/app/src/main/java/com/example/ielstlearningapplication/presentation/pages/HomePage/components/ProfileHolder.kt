package com.example.ielstlearningapplication.presentation.pages.HomePage.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.FakeUser
import com.example.ielstlearningapplication.presentation.pages.HomePage.data.user
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun ProfileHolder(currentUser: FakeUser, modifier: Modifier, onEvent: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiary
        ),
        onClick = onEvent
    ) {
        Row(
            modifier = modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .clip(CircleShape)
                    .fillMaxSize(),
                painter = painterResource(id = currentUser.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )

            Column(
                modifier = Modifier
                    .weight(3f)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Welcome",
                    fontSize = MaterialTheme.typography.bodyMedium.fontSize
                )
                Text(
                    text = currentUser.name,
                    fontWeight = FontWeight.Bold,
                    color = Color.Yellow
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileHolder() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        ProfileHolder(currentUser = user, modifier = Modifier, onEvent = {navController.navigate(Route.ProfileScreen.route)})
    }
}
