package org.example.di

import com.example.data.PlatformImpl
import com.example.domain.Platform
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformDataModule = module {
    singleOf(::PlatformImpl) { bind<Platform>() }
}