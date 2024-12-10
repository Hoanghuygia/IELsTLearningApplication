package com.example.ielstlearningapplication.presentation.pages.Notify

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.pages.Notify.components.NotifyItem

@Composable
fun NotifyContent(){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        val notifications = listOf(
            Triple(
                "Nguyen Van A",
                "responded to your comment: your cmt content here alo alo,...",
                "21 hours ago"
            ),
            Triple("Le Thi B", "liked your post", "15 hours ago"),
            Triple("Tran Van C", "shared your post", "10 hours ago"),
            Triple("Pham Thi D", "started following you", "5 hours ago"),
            Triple("Nguyen Van E", "commented on your post", "1 hour ago"),
            Triple("Le Thi B", "liked your post", "15 hours ago"),
            Triple("Tran Van C", "shared your post", "10 hours ago"),
            Triple("Pham Thi D", "started following you", "5 hours ago"),
            Triple("Nguyen Van E", "commented on your post", "1 hour ago")
        )
        items(notifications.size) { index ->
            val (name, message, time) = notifications[index]
            NotifyItem(
                name = name,
                message = message,
                time = time,
                imageRes = R.drawable.avartar // Thay thế bằng id ảnh của bạn
                //                    backgroundColor = if (selectedIndex == index) Color(0xFFFFE599) else Color.White,
                //                    onClick = { selectedIndex = index }
            )
        }
    }
}