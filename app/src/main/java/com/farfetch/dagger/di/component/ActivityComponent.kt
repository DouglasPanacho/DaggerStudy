package com.farfetch.dagger.di.component

import com.farfetch.dagger.MainActivity
import com.farfetch.dagger.di.module.ActivityModule
import dagger.Subcomponent

@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}
