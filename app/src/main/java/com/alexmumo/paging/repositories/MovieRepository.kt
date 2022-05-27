package com.alexmumo.paging.repositories

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.alexmumo.paging.data.cache.db.MovieDb
import com.alexmumo.paging.data.cache.entity.Movie
import com.alexmumo.paging.data.mediator.MovieRemoteMediator
import com.alexmumo.paging.data.network.ApiService
import kotlinx.coroutines.flow.Flow

@OptIn(ExperimentalPagingApi::class)
class MovieRepository constructor(
    private val apiService: ApiService,
    private val database: MovieDb
) {

    fun fetchMovies(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(pageSize = 20, enablePlaceholders = false),
            remoteMediator = MovieRemoteMediator(apiService = apiService, database = database),
            pagingSourceFactory = {
                database.movieDao().pagingSource()
            }
        ).flow
    }
}
