package com.alexmumo.paging.data.cache.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alexmumo.paging.data.cache.entity.Game

@Dao
interface GameDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveGame(game: List<Game>)

    @Query("SELECT * FROM game WHERE name LIKE :query")
    fun pagingSource(query: String): PagingSource<Int, Game>
}
