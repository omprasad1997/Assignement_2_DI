package com.example.assignement2.di.component

import com.example.assignement2.di.ActivityScope
import com.example.assignement2.di.module.ActivityModule
import com.example.assignement2.ui.main.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
}