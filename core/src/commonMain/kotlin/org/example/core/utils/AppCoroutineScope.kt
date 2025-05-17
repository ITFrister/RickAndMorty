package org.example.core.utils

import kotlinx.coroutines.CoroutineScope

expect object AppCoroutineScope {
    val uiScope: CoroutineScope
    val defaultScope: CoroutineScope
    val ioScope: CoroutineScope
}