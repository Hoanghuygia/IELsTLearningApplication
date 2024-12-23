package com.example.ielstlearningapplication.presentation.pages.AIChat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.presentation.pages.AIChat.components.AiChatTopBar
import com.example.ielstlearningapplication.presentation.pages.AIChat.components.Messages
import com.example.ielstlearningapplication.presentation.pages.AIChat.components.SendingBar
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun AIChatScreen(viewModel: AIChatViewModel = viewModel(),
    navController: NavController
) {
    val uiState = viewModel.uiState.collectAsState().value

    Scaffold(
        topBar = { AiChatTopBar(navController = navController) },
        bottomBar = {SendingBar(uiState = uiState, viewModel = viewModel, modifier = Modifier.padding(bottom = 8.dp))}
    ) { innerPadding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)) {
            Messages(messages = uiState.currentChat, modifier = Modifier.weight(1f))
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

