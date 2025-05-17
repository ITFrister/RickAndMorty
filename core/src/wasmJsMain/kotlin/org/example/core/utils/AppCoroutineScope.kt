package org.example.core.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

actual object AppCoroutineScope {
    actual val uiScope: CoroutineScope = CoroutineScope(Dispatchers.Default)
    actual val defaultScope: CoroutineScope get() = uiScope
    actual val ioScope: CoroutineScope get() = uiScope

}