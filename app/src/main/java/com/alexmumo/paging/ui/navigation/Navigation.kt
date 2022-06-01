package com.alexmumo.paging.ui.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.alexmumo.paging.ui.screens.detail.DetailScreen
import com.alexmumo.paging.ui.screens.home.HomeScreen

@ExperimentalFoundationApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(route = NavigationItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = NavigationItem.Details.route,
            arguments = listOf(
                navArgument("movieId") {
                    type = NavType.IntType
                }
            )
        ) {
            val movieId = it.arguments?.getInt("movieId")
            if (movieId != null) {
                DetailScreen(navController = navController, movieId)
            }
        }
    }
}
