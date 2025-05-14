package com.example.core

import android.os.Build

actual object AppConfig {
    actual val isDebug = Build.TYPE.equals("debug")
}