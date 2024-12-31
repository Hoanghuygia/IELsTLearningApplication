package com.example.ielstlearningapplication.presentation.pages.AIChat.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.domain.models.Message


@Composable
fun Messages(messages: List<Message>, modifier: Modifier) {
    val listState = rememberLazyListState()

    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.lastIndex)
        }
    }

    LazyColumn(modifier = modifier.fillMaxSize(), state = listState, reverseLayout = false) {
        items(messages) { message ->
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement =
                if (message.entity == 0) {
                    Arrangement.Start
                } else {
                    Arrangement.End
                }
            ) {
                MessageComponent(message = message)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessages() {
    IELsTLearningApplicationTheme {
//        Messages(DataChat.aMessage, modifier = Modifier)
    }
}