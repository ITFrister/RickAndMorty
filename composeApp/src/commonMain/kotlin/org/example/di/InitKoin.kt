package org.example.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this@startKoin)
        modules(
            appModule,
            domainModule,
            dataModule,
            platformDataModule,
            presentationModule,
            platformPresentationModule
        )
    }
}