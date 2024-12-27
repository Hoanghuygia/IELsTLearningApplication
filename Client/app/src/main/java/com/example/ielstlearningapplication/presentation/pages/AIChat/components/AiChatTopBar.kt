package com.example.ielstlearningapplication.presentation.pages.AIChat.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiChatTopBar(navController: NavController, modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text(text = "AI Chat about something") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
        navigationIcon = {
            IconButton(onClick = {navController.popBackStack()}) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Back home screen")
            }
        },
        actions = {
            IconButton(onClick = { }, modifier = modifier.padding(8.dp)) {
                Icon(Icons.Filled.EditNote, contentDescription = "More options", modifier = Modifier.size(32.dp))
            }
        }
    )
}