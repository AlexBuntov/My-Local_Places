package com.example.mylocalplaces.uii

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylocalplaces.data.ItemInfo
import com.example.mylocalplaces.data.Places
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme

@Composable
fun CategoryScreen (
    title: String,
    items: List<ItemInfo>,
){
    Scaffold(
        topBar = {
            ScreenHeader(
                headerTitle = title
            )
        }
    ) { innerPadding ->
        CategoriesList(
            items = items,
            onItemClick = { Places.supermarkets },
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        )
    }
}

@Preview (showBackground = true, showSystemUi = true)
@Composable
private fun CategoryScreenPreview () {
    MyLocalPlacesTheme() {
        CategoryScreen(
            items = Places.supermarkets,
            title = "Pohui"
        )
    }
}