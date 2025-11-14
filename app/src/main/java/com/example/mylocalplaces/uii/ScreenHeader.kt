package com.example.mylocalplaces.uii

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenHeader (headerTitle: String) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = headerTitle,
                style = MaterialTheme.typography.headlineMedium
            )
        }
    )
}