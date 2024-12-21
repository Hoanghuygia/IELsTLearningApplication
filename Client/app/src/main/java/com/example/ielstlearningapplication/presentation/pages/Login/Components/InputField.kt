package com.example.ielstlearningapplication.presentation.pages.Login.Components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputField(
    fieldValue: String,
    labelText: String,
    onReceiveInput: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .width(312.dp)
            .height(55.dp)
        ,
        textStyle = TextStyle.Default.copy(fontSize = 16.sp),
        value = fieldValue,
        onValueChange = onReceiveInput,
        label = {
            Text(text=labelText)
        }
    )
}