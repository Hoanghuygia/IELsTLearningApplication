package com.example.ielstlearningapplication.presentation.pages.Result

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.pages.Result.Components.CounterBox
import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours

@Composable
fun ResultScreen(testType: Int = -1, testTime : Duration = 0.0.hours) {
    val scrollState = rememberScrollState()

    val resultSheet = listOf<Int>(12,12,12)  // listOf(num_correct, num_wrong, num_null)
    val estimatedBand = 0.0

    Column (
        modifier = Modifier
            .padding(horizontal = 19.dp, vertical = 11.dp)
            .fillMaxSize()
            .verticalScroll(state = scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier,
        ) {
            Image(
                modifier = Modifier
                    .size(width = 37.dp, height = 42.dp)
                    .clickable { /*TODO*/ },
                painter = painterResource(R.drawable.back),
                contentDescription = "Go back to Test",
            )
            Spacer(modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.size(15.dp))

        Column (
            modifier = Modifier,
        ) {
            Text(
                modifier = Modifier,
                text = "Time: $testTime",
                color = Color(0, 33, 71),
                fontSize = 40.sp,
            )

            Spacer(modifier = Modifier.size(20.dp))

            Text(
                modifier = Modifier,
                text = "Est. Overall Band Score",
                color = Color(0, 33, 71),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.size(30.dp))

            Text(
                modifier = Modifier,
                text = estimatedBand.toString(),
                color = Color(0, 33, 71),
                fontSize = 128.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        for (i in 0..2) {
            Spacer(modifier = Modifier.size(20.dp))

            CounterBox(
                type = i,
                point = resultSheet[i]
            )
        }

        Spacer(modifier = Modifier.size(30.dp))

        Button(
            modifier = Modifier
                .height(70.dp)
                .width(277.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {/*Todo*/},
            colors = ButtonColors(
                containerColor = Color(255, 215, 0),
                contentColor = Color(255, 255, 255),
                disabledContainerColor = Color(255, 215, 0),
                disabledContentColor = Color(255, 255, 255)
            ),
        ) {
            Text(
                text = "Show Details",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
}

@Preview
@Composable
fun ResultScreenPreview() {
    IELsTLearningApplicationTheme {
        ResultScreen()
    }
}