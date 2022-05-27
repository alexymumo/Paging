package com.alexmumo.paging.data.cache.di

import androidx.room.Room
import com.alexmumo.paging.data.cache.db.MovieDb
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val cacheModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            MovieDb::class.java,
            "movie.db"
        ).fallbackToDestructiveMigration().build()
    }
}