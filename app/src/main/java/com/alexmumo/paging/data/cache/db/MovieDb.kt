package com.alexmumo.paging.data.cache.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexmumo.paging.data.cache.entity.Movie

@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = false
)
abstract class MovieDb : RoomDatabase() {
    abstract fun gameDao(): Movie
}
