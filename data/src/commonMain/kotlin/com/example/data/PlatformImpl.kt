package com.example.data

import com.example.domain.Platform

expect class PlatformImpl() : Platform {
    override fun getPlatform(): String
}