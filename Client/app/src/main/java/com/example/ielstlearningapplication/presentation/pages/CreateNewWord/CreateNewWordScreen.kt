package com.example.ielstlearningapplication.presentation.pages.CreateNewWord

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Switch
import androidx.compose.material.TextButton
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route
import com.example.ielstlearningapplication.presentation.pages.Setting.SettingScreen

@Composable
fun CreateNewWordScreen(navController: NavController) {
    var isInputNotNull1 by remember { mutableStateOf(false) }
    var isInputNotNull2 by remember { mutableStateOf(false) }
    var isInputNotNull3 by remember { mutableStateOf(false) }

    var newWord by remember { mutableStateOf("Enter a new word") }
    var wordType by remember { mutableStateOf("Enter type of word") }
    var wordDescription by remember { mutableStateOf("Meaning") }

    val openDialog = remember { mutableStateOf(false) }

    fun navigateBackToDictionary() {
        navController.navigate(Route.LibraryScreen.route)
    }

    Column(
        modifier = Modifier.padding(horizontal = 19.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .size(width = 393.dp, height = 50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(width = 12.dp, height = 30.dp)
                    .clickable(onClick = ::navigateBackToDictionary),
                painter = painterResource(R.drawable.go_back_arrow),
                contentDescription = "Return to library"
            )

            Spacer(modifier = Modifier.size(40.dp))

            Text (
                modifier = Modifier,
                text = "Create new word",
                color = Color(0, 33, 71),
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(356.dp)
                .height(55.dp)
            ,
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            value = newWord,
            onValueChange = {
                isInputNotNull1 = true
                newWord = it },
            label = {
                Text(
                    text="New Word",
                    fontSize = 14.sp,
                )
            },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(356.dp)
                .height(55.dp)
            ,
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            value = wordType,
            onValueChange = {
                isInputNotNull2 = true
                wordType = it },
            label = {
                Text(
                    text="Word Type",
                    fontSize = 14.sp,
                )
            },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(356.dp)
                .height(129.dp)
            ,
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            value = wordDescription,
            onValueChange = {
                isInputNotNull3 = true
                wordDescription = it },
            label = {
                Text(
                    text="Word Description",
                    fontSize = 14.sp,
                )
            },
            shape = RoundedCornerShape(12.dp),
        )
        Spacer(modifier = Modifier.size(20.dp).weight(1f))

        Button(
            modifier = Modifier
                .height(60.dp)
                .width(357.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {openDialog.value = true},
            colors = ButtonColors(
                containerColor = Color(255, 215, 0),
                contentColor = Color(255, 255, 255),
                disabledContainerColor = Color(255, 215, 0),
                disabledContentColor = Color(255, 255, 255)
            ),
        ) {
            Text(
                text = "Create new word",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    if (openDialog.value) {
        Dialog (
            onDismissRequest = {
                openDialog.value = false
                navigateBackToDictionary()
            }) {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
            ) {
                Text(
                    text = "Create new word successfully",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateNEwWordScreenPreview() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        CreateNewWordScreen(navController)
    }
}