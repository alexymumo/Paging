package com.alexmumo.paging.data.network


import com.alexmumo.paging.model.response.PopularResponse
import com.alexmumo.paging.utils.Constants.APIKEY
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    suspend fun fetchPopularMovies(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = APIKEY,
        @Query("language") language: String = "en"
    ): PopularResponse

    @GET("movie/popular{movieId}")
    suspend fun fetchMovieDetails(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = APIKEY,
        @Path("movieId") movieId: Int
    )
}
