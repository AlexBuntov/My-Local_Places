package com.example.mylocalplaces.uii

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylocalplaces.data.ItemInfo
import com.example.mylocalplaces.data.Places
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme

@Composable
fun CategoriesListItemImage(itemInfo: ItemInfo, modifier: Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(itemInfo.imageId),
            contentDescription = null,
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun CategoriesListItem(
    itemInfo: ItemInfo, onItemClick: (ItemInfo) -> Unit, modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        onClick = { onItemClick(itemInfo) },
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .size(128.dp)
        ) {
            CategoriesListItemImage(
                itemInfo = itemInfo, modifier = Modifier.size(128.dp)
            )
            Column(
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(itemInfo.nameId),
                    style = MaterialTheme.typography.titleMedium,
                )
                Spacer(Modifier.weight(1f))
                itemInfo.rating?.let { ratingValue ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Outlined.Star,
                            contentDescription = null,
                        )
                        Text(
                            text = ratingValue, style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CategoriesList(
    items: List<ItemInfo>,
    onItemClick: (ItemInfo) -> Unit,
    modifier: Modifier,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier,
    ) {
        items(items = items, key = { it.id }) {
            CategoriesListItem(
                itemInfo = it, onItemClick = onItemClick
            )
        }
    }
}


@Preview()
@Composable
private fun CategoriesListPreview() {
    MyLocalPlacesTheme {
        CategoriesList(
            items = Places.supermarkets,
            onItemClick = { Places.supermarkets },
            modifier = Modifier,
        )
    }
}