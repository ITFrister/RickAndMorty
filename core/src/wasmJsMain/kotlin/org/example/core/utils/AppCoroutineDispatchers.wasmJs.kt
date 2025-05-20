package org.example.core.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual object AppCoroutineDispatchers {
    actual val mainDispatcher: CoroutineDispatcher = Dispatchers.Default
    actual val defaultDispatcher: CoroutineDispatcher = mainDispatcher
    actual val ioDispatcher: CoroutineDispatcher = mainDispatcher
}