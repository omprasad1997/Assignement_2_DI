package com.example.assignement2.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.assignement2.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext() : Context = fragment.requireContext()
}