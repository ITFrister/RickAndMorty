package org.example

import android.app.Application
import org.example.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

actual class RickAndMortyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@RickAndMortyApplication)
        }

    }
}