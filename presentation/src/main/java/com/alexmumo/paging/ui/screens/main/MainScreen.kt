package com.alexmumo.paging.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.alexmumo.paging.ui.navigation.Navigation

@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Navigation(navController = navController)
}

@ExperimentalFoundationApi
@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}
