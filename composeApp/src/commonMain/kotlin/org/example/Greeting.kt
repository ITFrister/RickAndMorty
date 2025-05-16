package org.example

class Greeting {
    private val platform =

    fun greet(): String {
        return "Hello, ${platform.name}. Is debug: ${AppConfig.isDebug}!"
    }
}