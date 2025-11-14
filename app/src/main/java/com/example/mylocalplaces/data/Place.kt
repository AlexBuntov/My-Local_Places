package com.example.mylocalplaces.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


interface DefaultItemInfo {
    val id: Int
    val nameId: Int
    val imageId: Int
    val rating: String? get() = null
    val title: String
}

data class Place (
    override val title: String = "Выберите место",
    override val id: Int,
    @StringRes override val nameId: Int,
    val description: String,
    val review: String,
    override val rating: String,
    val address : String,
    @DrawableRes override val imageId: Int,
): DefaultItemInfo

data class Category (
    override val title: String = "Выберите категорию",
    override val id: Int,
    override val nameId: Int,
    override val imageId: Int,
) : DefaultItemInfo