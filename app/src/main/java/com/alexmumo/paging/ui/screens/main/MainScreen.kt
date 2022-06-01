package com.alexmumo.paging.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.alexmumo.paging.ui.composables.AppBar
import com.alexmumo.paging.ui.navigation.Navigation

@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            AppBar()
        }
    ) {
        Navigation(navController = navController)
    }
}
