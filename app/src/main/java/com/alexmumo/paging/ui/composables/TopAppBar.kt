package com.alexmumo.paging.ui.composables

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TopAppBar(
    title: @Composable() () -> Unit,
    color: Color = MaterialTheme.colors.primary,
    navigationIcon: @Composable() (() -> Unit)? = null
) {
}
