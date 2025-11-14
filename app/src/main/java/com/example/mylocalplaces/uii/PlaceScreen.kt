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
import com.example.mylocalplaces.data.Place
import com.example.mylocalplaces.data.Places
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme


@Composable
fun PlaceScreen (
    place: Place
) {
    Scaffold(
        topBar = {
            ScreenHeader(
                headerTitle = stringResource(place.nameId)
            )
        }
    ) { innerPadding ->
        Column(
        modifier = Modifier
            .padding(innerPadding)
            .verticalScroll(rememberScrollState())
    ) {
        PlaceImage(
            drawableId = place.imageId
        )
        PlaceReviewAndAddress(
            rating = place.rating,
            address = place.address,
        )
        PlaceDescription(
            description = place.description
        )
    }
    }
}



@Preview (showBackground = true, showSystemUi = true)
@Composable
private fun PlaceScreenPreview (){
    MyLocalPlacesTheme() {
        PlaceScreen(place = Places.supermarkets[1])
    }
}