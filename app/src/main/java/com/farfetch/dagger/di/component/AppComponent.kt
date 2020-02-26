package com.farfetch.dagger.di.component

import com.farfetch.dagger.di.module.ActivityModule
import com.farfetch.dagger.di.module.AppModule
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun activitysubComponent(module:ActivityModule): ActivityComponent
}
