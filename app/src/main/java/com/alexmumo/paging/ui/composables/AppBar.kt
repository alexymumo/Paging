package com.alexmumo.paging.ui.composables

import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun AppBar() {
    Text(
        text = "Paging",
        modifier = Modifier
            .background(Color.Cyan)

    )
}
