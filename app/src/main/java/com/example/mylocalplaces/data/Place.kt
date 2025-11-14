package com.example.mylocalplaces.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ItemInfo (
    val id: Int,
    @StringRes val nameId: Int,
    @DrawableRes val imageId: Int,
    val description: String? = null,
    val review: String? = null,
    val rating: String? = null,
    val address : String? = null,
)
