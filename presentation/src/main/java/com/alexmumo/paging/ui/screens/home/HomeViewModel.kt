package com.alexmumo.paging.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.alexmumo.paging.data.repository.PopularRepository
import com.alexmumo.paging.model.PopularMovie
import kotlinx.coroutines.flow.Flow

class HomeViewModel constructor(private val popularRepository: PopularRepository) : ViewModel() {
    val movies: Flow<PagingData<PopularMovie>> get() = fetchMovies()

    private fun fetchMovies(): Flow<PagingData<PopularMovie>> {
        return popularRepository.fetchPopularMovies().cachedIn(viewModelScope)
    }
}
