package com.example.assignement2.data.local

import android.content.Context
import com.example.assignement2.di.ApplicationContext
import com.example.assignement2.di.ApplicationScope
import com.example.assignement2.di.DatabaseName
import com.example.assignement2.di.DatabaseVersion
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val version: Int
) {

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}