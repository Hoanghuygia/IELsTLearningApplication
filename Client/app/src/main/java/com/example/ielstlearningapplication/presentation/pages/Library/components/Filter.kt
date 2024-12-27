package com.example.ielstlearningapplication.presentation.pages.Library.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Filter(

) {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Newest") }
    Column {

        // Selector Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.FilterList,
                contentDescription = "Filter",
                tint = Color(0xFFA9A9A9),
                modifier = Modifier.size(26.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .height(43.dp)
                    .width(1.dp)
                    .background(Color(0xFFA9A9A9))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable { expanded = !expanded },
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = selectedOption,
                    color = Color(0xFF002147),
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                painter = painterResource(id = R.drawable.octicon_triangle_down_24),
                contentDescription = "Dropdown",
                tint = Color(0xFF002147),
                modifier = Modifier
                    .height(21.dp)
                    .width(22.dp)
                    .clickable { expanded = !expanded }
            )
        }

        // Dropdown Menu
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            DropdownMenuItem(
                text = { Text("Newest", color = Color(0xFF002147), fontSize = 14.sp) },
                onClick = { selectedOption = "Newest"; expanded = false }
            )
            DropdownMenuItem(
                text = { Text("Latest", color = Color(0xFF002147), fontSize = 14.sp) },
                onClick = { selectedOption = "Latest"; expanded = false }
            )
            DropdownMenuItem(
                text = { Text("A-Z", color = Color(0xFF002147), fontSize = 14.sp) },
                onClick = { selectedOption = "A-Z"; expanded = false }
            )
            DropdownMenuItem(
                text = { Text("Z-A", color = Color(0xFF002147), fontSize = 14.sp) },
                onClick = { selectedOption = "Z-A"; expanded = false }
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFilter() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        Filter(
//            onBackClick = { /* TODO: Xử lý sự kiện quay lại */ },
//            onMoreClick = { /* TODO: Xử lý sự kiện cho nút More */ },
//            searchQuery = "", // Bạn có thể điền giá trị mặc định hoặc lấy từ ViewModel
//            onSearchQueryChange = { /* TODO: Xử lý sự thay đổi của ô tìm kiếm */ }
        )
    }
}
