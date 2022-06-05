package com.alexmumo.paging.ui.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alexmumo.paging.ui.screens.home.HomeScreen

@ExperimentalFoundationApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(route = NavigationItem.Home.route) {
            HomeScreen(navController = navController)
        }
    }
}
