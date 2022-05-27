package com.alexmumo.paging.data.network

import com.alexmumo.paging.data.cache.entity.Movie
import com.alexmumo.paging.utils.Constants.APIKEY
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    suspend fun fetchPopularMovies(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = APIKEY,
        @Query("language") language: String = "en"
    ): Movie
}
