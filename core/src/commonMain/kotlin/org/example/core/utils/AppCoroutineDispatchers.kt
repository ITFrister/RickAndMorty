package org.example.core.utils

import kotlinx.coroutines.CoroutineDispatcher

expect object AppCoroutineDispatchers {
    val mainDispatcher: CoroutineDispatcher
    val defaultDispatcher: CoroutineDispatcher
    val ioDispatcher: CoroutineDispatcher
}