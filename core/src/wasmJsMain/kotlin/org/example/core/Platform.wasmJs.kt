package org.example.core

actual class Platform actual constructor(){
    actual fun getPlatform(): String = "Web with Kotlin/Wasm"
}