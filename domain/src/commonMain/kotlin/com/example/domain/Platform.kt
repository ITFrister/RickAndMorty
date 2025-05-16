package com.example.domain

interface Platform {
    fun getPlatform(): String
}

expect val platform: Platform