package com.example.mylocalplaces.uii

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PlaceImage (
    @DrawableRes drawableId: Int,
    modifier: Modifier = Modifier
){
        Image(
            painter = painterResource(drawableId),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = modifier
                .fillMaxWidth()
                .height(400.dp)
                .clip(RoundedCornerShape(8.dp))
        )
}

@Composable
fun PlaceReviewAndAddress (
    rating: String,
    address: String,
    modifier: Modifier = Modifier
){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = null
        )
        Text(
            text = "Рейтинг: ${rating}",
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "Адрес: ${address}",
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun PlaceDescription (description: String) {
    Text(
        text = description
    )
}

