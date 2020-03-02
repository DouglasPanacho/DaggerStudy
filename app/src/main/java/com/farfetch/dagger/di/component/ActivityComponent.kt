package com.farfetch.dagger.di.component

import com.farfetch.dagger.MainActivity
import com.farfetch.dagger.di.module.ActivityModule
import dagger.Subcomponent
import javax.inject.Singleton


@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivityComponent
    }

    fun inject(activity: MainActivity)
}
