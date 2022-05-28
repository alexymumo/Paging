package com.alexmumo.paging.ui.screens.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable

@ExperimentalFoundationApi
@Composable
fun HomeScreen() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),

    ) {
    }
}
