package org.example.core.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

actual object AppCoroutineScope {
    actual val uiScope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)
    actual val defaultScope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    actual val ioScope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
}