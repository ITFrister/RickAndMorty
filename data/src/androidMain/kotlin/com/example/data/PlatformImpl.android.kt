package com.example.data

import android.os.Build
import com.example.domain.Platform

actual class PlatformImpl : Platform {
    actual override fun getPlatform(): String = "Android ${Build.VERSION.SDK_INT}"
}