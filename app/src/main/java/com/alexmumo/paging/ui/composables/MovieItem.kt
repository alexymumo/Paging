package com.alexmumo.paging.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun MovieItem(
    imageString: String,
    modifier: Modifier = Modifier
) {
    Card(modifier = Modifier.padding(5.dp)) {
        CoilImage(
            imageRequest = ImageRequest
                .Builder(LocalContext.current)
                .data(imageString)
                .crossfade(true)
                .build(),
            alignment = Alignment.Center,
            contentDescription = "movie image"
        )
    }
}
