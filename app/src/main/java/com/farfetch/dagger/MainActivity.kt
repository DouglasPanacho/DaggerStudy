package com.farfetch.dagger

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    @Inject
    lateinit var repo2: RepositoryImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityComponent = (application as App).appComponent.activityComponent().create()
        activityComponent.inject(this)

        setContentView(R.layout.activity_main)
        common.prin()
        repo.prin()
        Log.d("teste",repo.toString())
        Log.d("teste",repo2.toString())
    }
}
