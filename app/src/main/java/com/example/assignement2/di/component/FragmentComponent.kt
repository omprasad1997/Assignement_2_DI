package com.example.assignement2.di.component

import com.example.assignement2.di.FragmentScope
import com.example.assignement2.di.module.FragmentModule
import com.example.assignement2.ui.home.HomeFragment
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: HomeFragment)
}