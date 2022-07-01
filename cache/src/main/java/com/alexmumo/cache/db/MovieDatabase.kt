package com.alexmumo.cache.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexmumo.cache.dao.MovieDao
import com.alexmumo.cache.dao.RemoteKeyDao
import com.alexmumo.cache.entity.Movie
import com.alexmumo.cache.entity.RemoteKey

@Database(entities = [Movie::class, RemoteKey::class], version = 1)
abstract class MovieDatabase() : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun remoteDao(): RemoteKeyDao
}
