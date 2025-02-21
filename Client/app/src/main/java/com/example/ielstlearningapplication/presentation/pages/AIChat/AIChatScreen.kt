package com.example.ielstlearningapplication.presentation.pages.AIChat

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.pages.AIChat.components.AiChatTopBar
import com.example.ielstlearningapplication.presentation.pages.AIChat.components.Messages
import com.example.ielstlearningapplication.presentation.pages.AIChat.components.SendingBar
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun AIChatScreen(viewModel: AIChatViewModel = hiltViewModel(),
    navController: NavController
) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(key1 = uiState.userId) {
        Log.d("UserID at AIChatScreen", uiState.userId)
        viewModel.getMessages(uiState.userId)
    }

    Scaffold(
        topBar = { AiChatTopBar(navController = navController, label = uiState.chatLabel) },
        bottomBar = {SendingBar(uiState = uiState, viewModel = viewModel, modifier = Modifier.padding(bottom = 8.dp))}
    ) { innerPadding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)) {
            Messages(messages = uiState.messages, modifier = Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAiChatScreen(){
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        AIChatScreen(navController = navController)
    }
}

