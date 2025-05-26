package org.example.di

import org.example.data.remote.apiServices.ApiService
import org.example.data.remote.repositories.MainRepositoryImpl
import org.example.domain.repositories.MainRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
    singleOf(::ApiService)
    singleOf(::MainRepositoryImpl) { bind<MainRepository>() }
}