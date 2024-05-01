package com.example.assignement2.data.remote

import android.content.Context
import com.example.assignement2.di.ApplicationContext
import com.example.assignement2.di.NetworkApiKey
import javax.inject.Inject

class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey:String
){

    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }
}