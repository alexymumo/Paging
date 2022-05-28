package com.alexmumo.paging.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.alexmumo.paging.R
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun MovieItem() {
    Card(modifier = Modifier.padding(5.dp)) {
        CoilImage(
            imageModel = "imageUrl",
            alignment = Alignment.Center,
            placeHolder = ImageBitmap.imageResource(R.drawable.ic_account),
            contentScale = ContentScale.Crop,
            contentDescription = "movie image"
        )
    }
}
