package com.farfetch.dagger.di.module

import com.farfetch.dagger.Util.CommonClass
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideCommon(): CommonClass = CommonClass()

}
