package com.alexmumo.remote.models

import com.google.gson.annotations.SerializedName

data class MovieDto(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("adult")
    val adult: Boolean?,
    @SerializedName("backdropPath")
    val backdropPath: String?,
    @SerializedName("originalLanguage")
    val originalLanguage: String?,
    @SerializedName("originalTitle")
    val originalTitle: String?,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("popularity")
    val popularity: Double?,
    @SerializedName("posterPath")
    val posterPath: String?,
    @SerializedName("releaseDate")
    val releaseDate: String?,
    val title: String?,
    @SerializedName("video")
    val video: Boolean?,
    @SerializedName("voteAverage")
    val voteAverage: Double?,
    @SerializedName("voteCount")
    val voteCount: Int?,
    @SerializedName("category")
    val category: String?,
)
