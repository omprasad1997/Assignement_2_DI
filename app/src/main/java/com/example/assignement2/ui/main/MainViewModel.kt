package com.example.assignement2.ui.main

import com.example.assignement2.data.local.DatabaseService
import com.example.assignement2.data.remote.NetworkService
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }
}