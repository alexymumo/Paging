package com.alexmumo.remote.api

import com.alexmumo.remote.models.MovieResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun fetchMovies(
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = "232323",
        @Query("language") language: String = "en"
    ): MovieResponseDto
}
