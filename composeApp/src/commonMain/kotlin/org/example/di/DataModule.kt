package org.example.di

import com.example.data.remote.apiServices.ApiService
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

expect val platformDataModule: Module

val dataModule = module {
    singleOf(::ApiService)
}