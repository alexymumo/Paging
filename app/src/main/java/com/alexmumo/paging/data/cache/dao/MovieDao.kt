package com.alexmumo.paging.data.cache.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alexmumo.paging.data.cache.entity.Movie

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovie(movie: List<Movie>)

    @Query("SELECT * FROM popular_movies")
    fun pagingSource(): PagingSource<Int, Movie>
}
