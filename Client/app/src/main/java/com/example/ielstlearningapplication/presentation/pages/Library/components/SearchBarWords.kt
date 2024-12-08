package com.example.ielstlearningapplication.presentation.pages.Library.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarWords(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onMoreClick: () -> Unit,
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onBackClick) {
            Icon(
                imageVector = Icons.Default.ArrowBackIos,
//                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color(0xFF002147)
            )
        }
        TextField(
            value = searchQuery,
            onValueChange = onSearchQueryChange,
            placeholder = {
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(34.dp)
                .weight(1f)
                .padding(horizontal = 8.dp)
                .background(Color(0xFFEEEEEE), shape = RoundedCornerShape(25.dp)),
            colors = TextFieldDefaults.textFieldColors(
//                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
//                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Search",
                    tint = Color(0xFF9B9B9B)
                )
            }
        )
        Box(
            modifier = Modifier
                .size(28.dp)
                .background(Color(0xFFEEEEEE), shape = RoundedCornerShape(10.dp))
                .clickable(onClick = onMoreClick),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
                tint = Color(0xFFA9A9A9),
                modifier = Modifier.size(12.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewSearchBarWords() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        SearchBarWords(
            onBackClick = { /* TODO: Xử lý sự kiện quay lại */ },
            onMoreClick = { /* TODO: Xử lý sự kiện cho nút More */ },
            searchQuery = "", // Bạn có thể điền giá trị mặc định hoặc lấy từ ViewModel
            onSearchQueryChange = { /* TODO: Xử lý sự thay đổi của ô tìm kiếm */ }
        )
    }
}
