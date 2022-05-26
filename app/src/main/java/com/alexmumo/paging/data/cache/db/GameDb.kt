package com.alexmumo.paging.data.cache.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexmumo.paging.data.cache.dao.GameDao
import com.alexmumo.paging.data.cache.entity.Game

@Database(
    entities = [Game::class],
    version = 1,
    exportSchema = false
)
abstract class GameDb : RoomDatabase() {
    abstract val gameDao: GameDao
}
