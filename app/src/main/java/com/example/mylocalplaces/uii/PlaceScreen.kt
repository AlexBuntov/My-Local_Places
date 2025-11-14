package com.example.mylocalplaces.uii

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylocalplaces.data.Place
import com.example.mylocalplaces.data.Places
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme


@Composable
fun PlaceScreen (
    place: Place
) {
    Scaffold(
        topBar = {
            PlaceHeader(
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
        PlaceScreen(place = Places.allPlaces[1])
    }
}