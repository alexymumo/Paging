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

        startKoin {
            val modules = listOf(networkModule, presentationModule, repositoryModule)
            // Koin Android Logger
            androidLogger(level = Level.NONE)
            // inject Android context
            androidContext(this@BaseApplication)
            // use modules
            modules(modules)
        }
    }
}
