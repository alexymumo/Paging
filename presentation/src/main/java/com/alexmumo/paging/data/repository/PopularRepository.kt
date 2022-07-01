package com.alexmumo.paging.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.alexmumo.paging.data.network.ApiService
import com.alexmumo.paging.data.paging.PopularPagingSource
import com.alexmumo.paging.model.PopularMovie
import kotlinx.coroutines.flow.Flow

class PopularRepository constructor(private val apiService: ApiService) {
    fun fetchPopularMovies(): Flow<PagingData<PopularMovie>> {
        return Pager(
            config = PagingConfig(
                enablePlaceholders = false,
                pageSize = 30
            ),
            pagingSourceFactory = {
                PopularPagingSource(apiService)
            }
        ).flow
    }
}
