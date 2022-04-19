package com.example.prueba

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class PersonData: Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG)
        {
            Timber.plant(Timber.DebugTree())
        }
    }
}