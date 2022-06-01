package com.alexmumo.paging.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.alexmumo.paging.data.network.ApiService
import com.alexmumo.paging.model.PopularMovie
import retrofit2.HttpException
import java.io.IOException

class PopularPagingSource(private val apiService: ApiService) : PagingSource<Int, PopularMovie>() {
    override fun getRefreshKey(state: PagingState<Int, PopularMovie>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PopularMovie> {
        return try {
            val start = params.key ?: 1
            val movies = apiService.fetchPopularMovies(start)
            LoadResult.Page(
                data = movies.results,
                prevKey = if (start == 1) null else start - 1,
                nextKey = if (movies.results.isEmpty()) null else movies.page + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}

/*
* PagingSource requires to implement two function load() and getRefreshKey
* load() will be called by Paging library to asynchronously fetch more data to be displayed as user scrolls
*
*
* */
