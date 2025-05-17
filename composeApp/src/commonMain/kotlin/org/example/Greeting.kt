package org.example

import com.example.domain.Platform

class Greeting(
    private val platform: Platform
) {
    fun greet(): String = "Hello, ${platform.getPlatform()}."
}