package com.farfetch.dagger

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farfetch.dagger.Util.CommonClass
import com.farfetch.dagger.data.repo.Repository
import com.farfetch.dagger.data.repo.RepositoryImpl
import com.farfetch.dagger.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var common: CommonClass

    @Inject
    lateinit var repo: RepositoryImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as App).appComponent.inject(this)
        setContentView(R.layout.activity_main)
        common.prin()
        repo.prin()
    }
}
