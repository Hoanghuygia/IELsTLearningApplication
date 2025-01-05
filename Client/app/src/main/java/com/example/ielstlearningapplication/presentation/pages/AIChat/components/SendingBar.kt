package com.example.ielstlearningapplication.presentation.pages.AIChat.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowOutward
import androidx.compose.material.icons.rounded.CameraAlt
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ielstlearningapplication.presentation.pages.AIChat.AIChatViewModel
import com.example.ielstlearningapplication.presentation.pages.AIChat.models.AIChatUIState
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun SendingBar(uiState: AIChatUIState, viewModel: AIChatViewModel ,modifier: Modifier) {
    val focusRequester: FocusRequester = remember { FocusRequester() }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .imePadding()
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp)
    ) {
        Icon(
            Icons.Rounded.CameraAlt,
            contentDescription = "Next",
            modifier = modifier.padding(end = 8.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .focusRequester(focusRequester)
                .background(Color.White, shape = RoundedCornerShape(32.dp))
                .border(2.dp, Color.Gray, RoundedCornerShape(18.dp))
        ) {
            TextField(
                value = uiState.valueTextField,
                onValueChange = { viewModel.updateEnterTextField(it) },
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                placeholder = { Text("Type a message", color = Color.Gray) },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    focusedPlaceholderColor = Color.Gray,
                    unfocusedPlaceholderColor = Color.Gray
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Send
                ),
                trailingIcon = {
                    IconButton(onClick = {
                        viewModel.updateCurrentChat(uiState.valueTextField, entity = 1)
                        viewModel.sendMessage(uiState.valueTextField, viewModel.uiState.value.userId, uiState.currentChat.toString())
                        viewModel.clearEnterTextField()
                    }) {
                        Icon(Icons.Filled.ArrowOutward, contentDescription = "Next")
                    }
                },
                singleLine = true
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSendingBar() {
    IELsTLearningApplicationTheme {
        SendingBar(uiState = AIChatUIState(), viewModel = viewModel (), modifier = Modifier)
    }
}