package com.alexmumo.paging.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.alexmumo.paging.ui.composables.TopAppBar
import com.alexmumo.paging.ui.navigation.Navigation

@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Paging") },
                color = Color.Blue
            )
        }
    ) {
        Navigation(navController = navController)
    }
}
