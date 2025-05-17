package org.example.di

import com.example.network.ApiService
import com.example.network.createEngine
import com.example.network.createHttpClient
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val networkModule = module {
    singleOf(::createEngine) { bind<HttpClientEngine>() }
    singleOf(::createHttpClient) { bind<HttpClient>() }

    singleOf(::ApiService)
}