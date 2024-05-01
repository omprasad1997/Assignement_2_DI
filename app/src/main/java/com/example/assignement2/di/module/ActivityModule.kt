package com.example.assignement2.di.module

import android.app.Activity
import android.content.Context
import com.example.assignement2.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (private val activity:Activity){

    @ActivityContext
    @Provides
    fun provideContext() : Context {
        return activity
    }
}