package com.example.ielstlearningapplication.presentation.pages.Listening

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.ielstlearningapplication.presentation.pages.Listening.components.SearchBar
import com.example.ielstlearningapplication.presentation.pages.Listening.components.TabBar

@Composable
fun ListeningScreen(navController: NavHostController) {

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
                    TabBar(navController)

                }

        }




//@Preview(showBackground = true)
//@Composable
//fun PreviewListeningScreen() {
//    IELsTLearningApplicationTheme {
//        val navController = rememberNavController()
//        ListeningScreen(navController)
//    }
//}




