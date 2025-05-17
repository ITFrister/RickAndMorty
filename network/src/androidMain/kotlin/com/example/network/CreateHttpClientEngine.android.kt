package com.example.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

actual fun createEngine(): HttpClientEngine {
    return OkHttp.create()
}