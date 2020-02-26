package com.farfetch.dagger.di.component

import com.farfetch.dagger.MainActivity
import com.farfetch.dagger.di.module.ActivityModule
import com.farfetch.dagger.di.module.AppModule
import com.farfetch.dagger.di.module.SubcomponentsModule
import dagger.Component

@Component(modules = [AppModule::class,SubcomponentsModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}
