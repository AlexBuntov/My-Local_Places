package com.example.mylocalplaces.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place (
    val id: Int,
    @StringRes val nameId: Int,
    val description: String,
    val review: String,
    val rating: String,
    val address : String,
    @DrawableRes val imageId: Int
)