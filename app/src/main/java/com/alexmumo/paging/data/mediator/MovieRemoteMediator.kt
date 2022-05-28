package com.alexmumo.paging.data.mediator

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.alexmumo.paging.data.cache.db.MovieDb
import com.alexmumo.paging.data.cache.entity.Movie
import com.alexmumo.paging.data.cache.entity.RemoteKey
import com.alexmumo.paging.data.network.ApiService
import retrofit2.HttpException
import java.io.IOException

@ExperimentalPagingApi
class MovieRemoteMediator(
    private val database: MovieDb,
    private val apiService: ApiService
) : RemoteMediator<Int, Movie>() {
    val movieDao = database.movieDao()
    val remoteDao = database.remoteDao()
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, Movie>
    ): MediatorResult {
        return try {
            val response = when (loadType) {
                LoadType.REFRESH -> {
                    val remoteKeys = getMovieKeysClosestToCurrentPosition(state)
                    remoteKeys.next_key.minus(1)
                }
                LoadType.PREPEND -> {
                    val remoteKeys = getMovieKeysForFirstItem(state)
                    val prevkey = remoteKeys.prev_key
                    prevkey
                }
                LoadType.APPEND -> {
                    val remoteKeys = getMovieKeysForLastItem(state)
                    val nextkey = remoteKeys.next_key
                    nextkey
                }
            }
            MediatorResult.Success(endOfPaginationReached = true)
        } catch (e: IOException) {
            MediatorResult.Error(e)
        } catch (e: HttpException) {
            MediatorResult.Error(e)
        }
    }

    private fun getMovieKeysClosestToCurrentPosition(state: PagingState<Int, Movie>): RemoteKey {
        return state.anchorPosition.let { position ->
            state.closestItemToPosition(position).let {
                database.remoteDao().saveKey()
            }

        }

    }

    private fun getMovieKeysForLastItem(state: PagingState<Int, Movie>): RemoteKey {
    }

    private fun getMovieKeysForFirstItem(state: PagingState<Int, Movie>): RemoteKey {

    }
}
