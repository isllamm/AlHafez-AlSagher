package com.isllam.alhafez_alsagher

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class MyApp: Application(){
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

    }

}