package com.alexmumo.paging.data.mediator

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.alexmumo.paging.data.cache.db.MovieDb
import com.alexmumo.paging.data.cache.entity.Movie
import retrofit2.HttpException
import java.io.IOException

@OptIn(ExperimentalPagingApi::class)
class MovieRemoteMediator(
    private val query: String,
    private val database: MovieDb
) : RemoteMediator<Int, Movie>() {
    val gameDao = database.gameDao()
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, Movie>
    ): MediatorResult {
        return try {
            val response = when (loadType) {
                LoadType.PREPEND -> {
                }
                LoadType.APPEND -> {
                }
                LoadType.REFRESH -> {
                }
            }
            MediatorResult.Success(endOfPaginationReached = true)
        } catch (e: IOException) {
            MediatorResult.Error(e)
        } catch (e: HttpException) {
            MediatorResult.Error(e)
        }
    }
}
