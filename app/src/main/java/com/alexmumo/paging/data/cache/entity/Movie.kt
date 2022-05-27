package com.alexmumo.paging.data.cache.entity // ktlint-disable filename

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game")
data class Movie(
    @PrimaryKey(autoGenerate = true)
    val movieId: Int,
    val id: Int,
    val name: String,
    val movieImage: String,
    val releaseDate: String
)
