package com.example.ielstlearningapplication.data.remote.dto.user

import com.google.gson.annotations.SerializedName

data class GetUserByEmailResponse(
    @SerializedName("user_id")
    val userId: String
)
