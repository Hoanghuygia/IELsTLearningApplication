package com.example.ielstlearningapplication.presentation.pages.Result.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R

@Composable
fun CounterBox(type : Int, point : Int) {
    val boxColor : Color
    val boxIcon : Int

    val textColor : Color

    when (type) {
        //type 0: Correct
        0 -> {
            boxColor = Color(180, 244, 183)
            boxIcon = R.drawable.correct
            textColor = Color(76, 175, 80)
        }

        //type 1: Incorrect
        1 -> {
            boxColor = Color(255, 193, 193)
            boxIcon = R.drawable.wrong
            textColor = Color(244, 47, 76)
        }

        //type 2: Not Answer
        2 -> {
            boxColor = Color(217, 217, 217)
            boxIcon = R.drawable.missing
            textColor = Color(169, 169, 169)
        }

        //Invalid
        else -> {
            boxColor = Color(0, 0, 0)
            boxIcon = R.drawable.missing
            textColor = Color(255, 255, 255)
        }
    }

    Card (
        modifier = Modifier.size(width = 277.dp, 96.dp),
        backgroundColor = boxColor,
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            modifier = Modifier
                .background(boxColor)
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(43.dp),
                painter = painterResource(boxIcon),
                contentDescription = ""
            )

            Spacer(modifier = Modifier.size(66.dp))

            Text(
                modifier = Modifier,
                text = point.toString(),
                fontSize = 48.sp,
                color = textColor
            )
        }
    }
}

@Preview
@Composable
fun CounterBoxPreview() {
    IELsTLearningApplicationTheme {
        Box(
            modifier = Modifier.padding(50.dp),
        ) {
            CounterBox(2, 12)
        }
    }
}


