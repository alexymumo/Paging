package com.alexmumo.paging

import android.app.Application
import com.alexmumo.paging.data.cache.di.cacheModule
import com.alexmumo.paging.data.network.di.networkModule
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
        val modules = listOf(networkModule, cacheModule, presentationModule)
        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@BaseApplication)
            modules(modules)
        }
    }
}
