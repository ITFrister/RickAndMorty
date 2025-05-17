package org.example

import android.app.Application
import org.example.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class RickAndMortyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@RickAndMortyApplication)
            androidLogger(Level.DEBUG)
        }

    }
}