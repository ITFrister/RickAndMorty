package org.example.core

import android.os.Build

actual class Platform actual constructor(){
    actual fun getPlatform(): String = "Android ${Build.VERSION.SDK_INT}"
}