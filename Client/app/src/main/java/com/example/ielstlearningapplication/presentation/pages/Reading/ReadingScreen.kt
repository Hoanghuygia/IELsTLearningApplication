package com.example.ielstlearningapplication.presentation.pages.Reading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ielstlearningapplication.presentation.pages.Reading.components.SearchBar
import com.example.ielstlearningapplication.presentation.pages.Reading.components.TabBar
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun ReadingScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 0.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SearchBar(
            onBackClick = { /* TODO: Xử lý sự kiện quay lại */ },
            onMoreClick = { /* TODO: Xử lý sự kiện cho nút More */ },
            searchQuery = "", // Bạn có thể điền giá trị mặc định hoặc lấy từ ViewModel
            onSearchQueryChange = { /* TODO: Xử lý sự thay đổi của ô tìm kiếm */ }
        )
        TabBar()

    }

}




@Preview(showBackground = true)
@Composable
fun PreviewReadingScreen() {
    IELsTLearningApplicationTheme {
        ReadingScreen()
    }
}




