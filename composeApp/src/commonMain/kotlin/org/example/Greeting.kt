package org.example

import org.example.core.Platform

class Greeting(
    private val platform: Platform
) {
    fun greet(): String = "Hello, ${platform.getPlatform()}."
}