package com.example.assignement2

import android.app.Application
import com.example.assignement2.data.local.DatabaseService
import com.example.assignement2.data.remote.NetworkService
import com.example.assignement2.di.component.ApplicationComponent
import com.example.assignement2.di.component.DaggerApplicationComponent
import com.example.assignement2.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponent.inject(this)
    }
}