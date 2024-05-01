package com.example.assignement2.di.component

import android.content.Context
import com.example.assignement2.MyApplication
import com.example.assignement2.data.local.DatabaseService
import com.example.assignement2.data.local.FileStorageService
import com.example.assignement2.data.remote.NetworkService
import com.example.assignement2.di.ApplicationContext
import com.example.assignement2.di.ApplicationScope
import com.example.assignement2.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext() : Context

    fun getNetworkService() : NetworkService

    fun getFileStorageService() : FileStorageService

    fun getDatabaseService() : DatabaseService
}