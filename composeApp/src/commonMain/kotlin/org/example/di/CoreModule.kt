package org.example.di


import org.example.core.Platform
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val coreModule = module {
    singleOf(::Platform)
}