package com.farfetch.dagger

import android.app.Application
import com.farfetch.dagger.di.component.AppComponent
import com.farfetch.dagger.di.component.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}
