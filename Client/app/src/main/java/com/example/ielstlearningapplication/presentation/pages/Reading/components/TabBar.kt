package com.example.ielstlearningapplication.presentation.pages.Reading.components

import AcademicContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.pages.Listening.components.SearchBar
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@Composable
fun TabBar(navController: NavHostController) {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Academic", "General Training")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(0.dp),
                clip = false,
                ambientColor = Color(0x40000000),
                spotColor = Color(0x40000000)
            )
    ) {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = Color.White,
            contentColor = Color(0xFF002147),
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    color = Color(0xFF002147),
                    height = 2.dp
                )
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = {
                        Text(
                            text = title,
//                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight.Normal,
                            fontSize = 16.sp,
                            color = if (selectedTabIndex == index) Color(0xFF002147) else Color.Gray,
                            textAlign = TextAlign.Center
                        )
                    }
                )
            }

        }
        when (selectedTabIndex) {
            0 -> AcademicContent(navController)
            1 -> GeneralTrainingContent(navController)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTabBar() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        SearchBar(
            onBackClick = { /* TODO: Xử lý sự kiện quay lại */ },
            onMoreClick = { /* TODO: Xử lý sự kiện cho nút More */ },
            searchQuery = "", // Bạn có thể điền giá trị mặc định hoặc lấy từ ViewModel
            onSearchQueryChange = { /* TODO: Xử lý sự thay đổi của ô tìm kiếm */ }
        )
    }
}



