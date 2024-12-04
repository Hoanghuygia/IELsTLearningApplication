package com.example.ielstlearningapplication.presentation.pages.HomePage.data

import androidx.annotation.DrawableRes
import com.example.ielstlearningapplication.R

data class FakeUser(
    var name: String,
    @DrawableRes val image: Int
)

val user = FakeUser(name = "Hoang Gia Huy", image = R.drawable.avartar)
