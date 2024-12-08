package com.example.ielstlearningapplication.presentation.pages.Listening.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.R

@Composable
fun AcademicContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val items = listOf(
            R.drawable.notdone to "Cambridge IELTS 16 Academic Listening - Test 1",
            R.drawable.notdone to "Cambridge IELTS 16 Academic Listening - Test 2",
            R.drawable.notdone to "Cambridge IELTS 16 Academic Listening - Test 3",
            R.drawable.notdone to "Cambridge IELTS 16 Academic Listening - Test 4"
        )

        items.forEach { (icon, text) ->
            Row(
                modifier = Modifier
                    .clickable { /* Xử lý sự kiện click */ }
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = text,
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
    }
}