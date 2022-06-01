package com.alexmumo.paging.data.repository.di

import com.alexmumo.paging.data.repository.PopularRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { PopularRepository(apiService = get())
    }
}
