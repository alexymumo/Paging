package com.alexmumo.paging.data.cache.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexmumo.paging.data.cache.dao.MovieDao
import com.alexmumo.paging.data.cache.dao.RemoteDao
import com.alexmumo.paging.data.cache.entity.Movie
import com.alexmumo.paging.data.cache.entity.RemoteKey

@Database(
    entities = [Movie::class, RemoteKey::class],
    version = 1,
    exportSchema = false
)
abstract class MovieDb : RoomDatabase() {
    abstract fun gameDao(): MovieDao
    abstract fun remoteDao(): RemoteDao
}
