package com.example.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.js.Js

actual fun createEngine(): HttpClientEngine {
    return Js.create()
}