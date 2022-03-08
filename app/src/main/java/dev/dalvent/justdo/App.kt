package dev.dalvent.justdo

import android.app.Application

class App : Application() {
    val appComponent = DaggerAppComponent.create()
}