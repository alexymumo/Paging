package com.alexmumo.cache.di

import androidx.room.Room
import com.alexmumo.cache.db.MovieDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import org.koin.dsl.single

val cacheModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            MovieDatabase::class.java,
            "movie.db"
        ).build()
    }
}
