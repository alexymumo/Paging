package com.alexmumo.paging.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.alexmumo.paging.repositories.MovieRepository

class HomeViewModel constructor(private val movieRepository: MovieRepository) : ViewModel() {
    val movies = movieRepository.fetchMovies().cachedIn(viewModelScope)
}
