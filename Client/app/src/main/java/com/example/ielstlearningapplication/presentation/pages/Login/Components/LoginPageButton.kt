package com.example.ielstlearningapplication.presentation.pages.Login.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LoginPageButton(
    buttonColors: ButtonColors,
    buttonContent: String,
    icon : Int?,
    onButtonClick: () -> Unit

) {
    Button(
        modifier = Modifier
            .height(48.dp)
            .width(312.dp),
        onClick = onButtonClick,
        colors = buttonColors,
    ) {
        if (icon != null) {
            Image(
            modifier = Modifier
                .size(26.dp)
            ,
            painter = painterResource(id = icon),
            contentDescription = "method logo"
        )
        }
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = buttonContent
        )
    }
}