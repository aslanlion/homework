package com.example.core

import android.app.Application
import android.content.Context

class BaseApplication: Application() {
    companion object {
        @JvmStatic
        private var currentApplication:Context? = null
        fun currentApplication(): Context? {
            return currentApplication
        }
    }
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}