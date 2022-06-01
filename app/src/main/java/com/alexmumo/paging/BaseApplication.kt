package com.alexmumo.paging

import android.app.Application
import com.alexmumo.paging.data.network.di.networkModule
import com.alexmumo.paging.data.repository.di.repositoryModule
import com.alexmumo.paging.ui.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = listOf(networkModule, repositoryModule, presentationModule)
        startKoin {
            androidLogger(level = Level.NONE)
            androidContext(this@BaseApplication)
            modules(modules)
        }
    }
}
