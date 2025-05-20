package org.example.core.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual object AppCoroutineDispatchers {
    actual val mainDispatcher: CoroutineDispatcher = Dispatchers.Main
    actual val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default
    actual val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
}