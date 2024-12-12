package com.example.buildprojectwithcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

//import com.example.buildprojectwithcompose.ui.theme.BuildProjectWithComposeTheme

@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun Task1Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Image:",
                    modifier = Modifier.padding(end = 8.dp),
                    color = Color.Black,
                    fontSize = 16.sp
                )
                Button(
                    onClick = { /* Handle upload click */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFEB3B)),
                    modifier = Modifier.height(40.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Icon(
                        Icons.Default.ArrowBack, // Replace with your upload icon
                        contentDescription = "Upload",
                        modifier = Modifier.size(20.dp),
                        tint = Color(0xFF002147)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Upload", color = Color(0xFF002147))
                }
            }
            OutlinedTextField(
                value = "",
                onValueChange = { /* Handle text change */ },
                label = { Text("Enter your writing task or instructions...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .height(93.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { /* Handle essay input */ },
                placeholder = { Text("Start typing your essay here...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .height(473.dp),
            )
            Button(
                onClick = { /* Handle practice click */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFD700),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Practice",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }

}

@Composable
fun Task2Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            OutlinedTextField(
                value = "",
                onValueChange = { /* Handle text change */ },
                label = { Text("Enter your writing task or instructions...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .height(93.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { /* Handle essay input */ },
                placeholder = { Text("Start typing your essay here...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .height(473.dp),
            )
            Button(
                onClick = { /* Handle practice click */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFD700),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Practice",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

    }
}


