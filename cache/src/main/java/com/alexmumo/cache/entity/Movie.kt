package com.alexmumo.cache.entity

import androidx.room.Entity

@Entity(tableName = "movie_table")
data class Movie(
    val adult: Boolean?,
    val backdropPath: String?,
    val movie_id: Int?,
    val originalLanguage: String?,
    val originalTitle: String?,
    val overview: String?,
    val popularity: Double?,
    val posterPath: String?,
    val releaseDate: String?,
    val title: String?,
    val video: Boolean?,
    val voteAverage: Double?,
    val voteCount: Int?,
    val category: String?,
    val isFavorite: Boolean?,
)
