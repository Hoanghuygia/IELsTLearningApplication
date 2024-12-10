package com.example.ielstlearningapplication.presentation.pages.Library.components

import androidx.compose.ui.tooling.preview.Preview
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.R

@Composable
fun CardWord(
    word: String,
    type: String,
    meaning: String,
    imageRes: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = word,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = type,
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = meaning,
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black
                )
            }
        }
    }
}

@Composable
fun CardWordList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        val words = listOf(
            Triple("admiration", "noun", "sự ngưỡng mộ"),
            Triple("happiness", "noun", "hạnh phúc"),
            Triple("challenge", "noun", "thách thức"),
            Triple("success", "noun", "thành công"),
            Triple("effort", "noun", "nỗ lực")
        )

        items(words.size) { index ->
            val (word, type, meaning) = words[index]
            CardWord(
                word = word,
                type = type,
                meaning = meaning,
                imageRes = R.drawable.flag_vn // Thay thế bằng id ảnh của bạn
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardWordList() {
    IELsTLearningApplicationTheme {
        CardWordList()
    }
}
