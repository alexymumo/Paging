package com.alexmumo.paging.data.network.di

import com.alexmumo.paging.data.network.ApiService
import com.alexmumo.paging.utils.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(provideOkHttp())
            .build()
            .create(ApiService::class.java)
    }
}

fun provideLoggingInterceptor(): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
}

fun provideOkHttp(): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(provideLoggingInterceptor())
        .callTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

}
