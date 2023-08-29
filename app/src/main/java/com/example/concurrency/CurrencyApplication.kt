package com.example.concurrency

import android.app.Application
import com.example.concurrency.data.local.FavoriteDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CurrencyApplication: Application(){

        override fun onCreate() {
            super.onCreate()
            // Initialize your singleton database instance here
            FavoriteDatabase.getInstance(this)
        }

}