package com.example.ielstlearningapplication.presentation.pages.ProfileChange

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme
import com.example.ielstlearningapplication.R
import com.example.ielstlearningapplication.presentation.navGraph.Route
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import com.example.ielstlearningapplication.presentation.pages.ProfileChange.Components.DatePickerDocked

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileChangeScreen(navController: NavController) {
    val genders = listOf("Male", "Female", "Other")
    var genderExpand by remember { mutableStateOf(false)}

    val targetedBand = listOf("5.5", "6.0", "6.5", "7.0", "7.5", "8.0", "8.5", "9.0")
    var targetExpand by remember { mutableStateOf(false)}

    var userName by remember { mutableStateOf("Nguyen Van A") }
    var userGender by remember { mutableStateOf(genders[0]) }
    var userDoB by remember { mutableStateOf("01/04/2000") }
    var userEmail by remember { mutableStateOf("vana@gmail.com") }
    var userTarget by remember { mutableStateOf(targetedBand[5]) }

    fun confirmChange() {
        navController.navigate(Route.HomeScreen.route)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(245, 245, 245))
            .verticalScroll(rememberScrollState())

    ){
        Row (
            modifier = Modifier.padding(horizontal = 18.dp, vertical = 26.dp)
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "Account",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0, 33, 71)
            )

            Image(
                modifier = Modifier
                    .size(28.dp),
                painter = painterResource(R.drawable.mdi_pen),
                contentDescription = "Change Account Button")
        }

        Box(
            modifier = Modifier
                .height(210.dp)
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .size(width = 393.dp, height = 180.dp)
                ,
                painter = painterResource(R.drawable.profile_background),
                contentDescription = "Profile background"
            )

            Image(
                modifier = Modifier.size(120.dp).align(Alignment.BottomStart),
                painter = painterResource(R.drawable.profile_picture),
                contentDescription = "Profile picture"
            )
        }

        Column(
            modifier = Modifier.padding(horizontal = 18.dp, vertical = 20.dp).weight(1f)
        ) {

            OutlinedTextField(
                modifier = Modifier
                    .width(312.dp)
                ,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                value = userName,
                onValueChange = {userName = it},
            )

            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.gender_icon),
                    contentDescription = "Gender Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    ExposedDropdownMenuBox(
                        modifier = Modifier.height(50.dp),
                        expanded = genderExpand,
                        onExpandedChange = {
                            genderExpand = !genderExpand
                        }
                    ) {
                        TextField(
                            modifier = Modifier.menuAnchor(),
                            readOnly = true,
                            value = userGender,
                            onValueChange = { },
                            label = { Text("Gender") },
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(
                                    expanded = genderExpand
                                )
                            },
                            colors = ExposedDropdownMenuDefaults.textFieldColors(
                                focusedContainerColor = Color(245, 245, 245),
                                unfocusedContainerColor = Color(245, 245, 245),
                                unfocusedIndicatorColor = Color(169, 169, 169),
                                focusedIndicatorColor = Color(169, 169, 169)
                            ),
                            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                        )
                        ExposedDropdownMenu(
                            expanded = genderExpand,
                            onDismissRequest = {
                                genderExpand = false
                            }
                        ) {
                            genders.forEach { selectionOption ->
                                DropdownMenuItem (
                                    onClick = {
                                        userGender = selectionOption
                                        genderExpand = false
                                    }
                                ){
                                    Text(text = selectionOption)
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.cake_icon),
                    contentDescription = "Birthday Date Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    DatePickerDocked()

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        modifier = Modifier,
                        text = "Birthday",
                        fontSize = 12.sp,
                        color = Color(169, 169, 169)
                    )
                    HorizontalDivider(color = Color(169, 169, 169), thickness = 1.dp)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.mail_icon),
                    contentDescription = "Email Icon",
                )

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    OutlinedTextField(
                        modifier = Modifier
                            .width(312.dp)
                        ,
                        textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                        value = userEmail,
                        onValueChange = {userEmail = it},
                        label = {
                            Text(
                                text = "email",
                                fontSize = 14.sp,
                                )
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
            ){
                Image(
                    modifier = Modifier
                        .size(43.dp),
                    painter = painterResource(R.drawable.target_icon),
                    contentDescription = "User's Target Score Icon")

                Column (
                    modifier = Modifier.padding(horizontal = 20.dp)
                ){
                    ExposedDropdownMenuBox(
                        modifier = Modifier.height(50.dp),
                        expanded = targetExpand,
                        onExpandedChange = {
                            targetExpand = !targetExpand
                        }
                    ) {
                        TextField(
                            modifier = Modifier.menuAnchor(),
                            readOnly = true,
                            value = userTarget,
                            onValueChange = { },
                            label = { Text("Target") },
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(
                                    expanded = targetExpand
                                )
                            },
                            colors = ExposedDropdownMenuDefaults.textFieldColors(
                                focusedContainerColor = Color(245, 245, 245),
                                unfocusedContainerColor = Color(245, 245, 245),
                                unfocusedIndicatorColor = Color(169, 169, 169),
                                focusedIndicatorColor = Color(169, 169, 169)
                            ),
                            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                        )

                        ExposedDropdownMenu(
                            expanded = targetExpand,
                            onDismissRequest = {
                                targetExpand = false
                            }
                        ) {
                            targetedBand.forEach { selectionOption ->
                                DropdownMenuItem (
                                    onClick = {
                                        userTarget = selectionOption
                                        targetExpand = false
                                    }
                                ){
                                    Text(text = selectionOption)
                                }
                            }
                        }
                    }
                }
            }
        }

        Button(
            modifier = Modifier
                .height(60.dp)
                .width(357.dp)
                .align(Alignment.CenterHorizontally),
            onClick = ::confirmChange,
            colors = ButtonColors(
                containerColor = Color(255, 215, 0),
                contentColor = Color(255, 255, 255),
                disabledContainerColor = Color(255, 215, 0),
                disabledContentColor = Color(255, 255, 255)
            ),
        ) {
            Text(
                text = "Save changes",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.size(10.dp))

    }
}

@Preview
@Composable
fun ProfileChangeScreenPreview() {
    IELsTLearningApplicationTheme {
        val navController = rememberNavController()
        ProfileChangeScreen(navController)
    }
}