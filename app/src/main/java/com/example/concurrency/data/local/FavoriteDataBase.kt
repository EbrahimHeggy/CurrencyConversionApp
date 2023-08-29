package com.example.concurrency.data.local


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.concurrency.data.remote.model.DataX

@Database(entities = [DataX::class], version = 1)
abstract class FavoriteDatabase : RoomDatabase() {
    abstract fun currencyDao(): FavCurrencyDao
}


