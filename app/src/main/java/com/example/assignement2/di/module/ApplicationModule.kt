package com.example.assignement2.di.module

import android.content.Context
import com.example.assignement2.MyApplication
import com.example.assignement2.data.local.FileStorageService
import com.example.assignement2.data.remote.HttpClient
import com.example.assignement2.di.ApplicationContext
import com.example.assignement2.di.ApplicationScope
import com.example.assignement2.di.DatabaseName
import com.example.assignement2.di.DatabaseVersion
import com.example.assignement2.di.NetworkApiKey
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @ApplicationScope
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @DatabaseName
    @Provides
    fun provideDatabaseName(): String = "dummy_db"

    @DatabaseVersion
    @Provides
    fun provideDatabaseVersion(): Int =  1

    @NetworkApiKey
    @Provides
    fun provideApiKey(): String = "SOME_API_KEY"


    @ApplicationScope
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }
}