package com.alexmumo.paging.data.mediator

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.alexmumo.paging.data.cache.entity.Game

@OptIn(ExperimentalPagingApi::class)
class GameRemoteMediator(
    private val query: String
) : RemoteMediator<Int, Game>() {
    override suspend fun load(loadType: LoadType, state: PagingState<Int, Game>): MediatorResult {
        TODO("Not yet implemented")
    }
}
