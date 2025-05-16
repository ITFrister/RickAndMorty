package org.example.di

import com.example.data.PlatformImpl
import com.example.domain.Platform
import org.koin.dsl.module

actual val platformDataModule = module {
    single<Platform> { PlatformImpl() }
}