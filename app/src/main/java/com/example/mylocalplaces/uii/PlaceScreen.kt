package com.example.mylocalplaces.uii

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylocalplaces.data.ItemInfo
import com.example.mylocalplaces.data.Places
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme


@Composable
fun PlaceScreen(
    place: ItemInfo
) {
    Scaffold(
        topBar = {
            ScreenHeader(
                headerTitle = stringResource(place.nameId)
            )
        }) { innerPadding ->
        with(place) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState())
            ) {
                PlaceImage(
                    drawableId = imageId
                )
                PlaceReviewAndAddress(
                    rating = rating,
                    address = address,
                )
                description?.let {
                    PlaceDescription(
                        description = description
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PlaceScreenPreview() {
    MyLocalPlacesTheme {
        PlaceScreen(place = Places.supermarkets[1])
    }
}