package com.alexmumo.paging.ui.screens.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.alexmumo.paging.ui.composables.MovieItem
import com.alexmumo.paging.utils.Constants
import org.koin.androidx.compose.getViewModel

@ExperimentalFoundationApi
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = getViewModel()
) {
    val movies = remember {
        viewModel.movies
    }.collectAsLazyPagingItems()
    val liststate = rememberLazyListState()
    LazyVerticalGrid(
        state = liststate,
        cells = GridCells.Fixed(2)
    ) {
        items(movies.itemCount) { index ->
            movies[index]?.let { movie ->
                MovieItem(
                    imageString = "${Constants.IMAGE_URL}/${movie.backdropPath}",
                    modifier = Modifier
                        .width(60.dp)
                        .height(50.dp)
                        .clickable {
                            navController.navigate("details/${movie.id}")
                        }
                )
            }
        }
    }
}
