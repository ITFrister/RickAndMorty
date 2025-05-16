package com.example.data

import com.example.domain.Platform

actual class PlatformImpl : Platform {
    actual override fun getPlatform(): String = "Web with Kotlin/Wasm"
}