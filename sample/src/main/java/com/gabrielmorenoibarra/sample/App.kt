package com.gabrielmorenoibarra.sample

import androidx.multidex.MultiDexApplication
import com.gabrielmorenoibarra.k.util.KLog

class App : MultiDexApplication() {

    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        KLog.launch(BuildConfig.DEBUG)
    }
}
