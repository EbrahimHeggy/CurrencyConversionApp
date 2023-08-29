package com.example.concurrency.data.local

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CurrencyEntity::class], version = 1)
abstract class FavoriteDatabase : RoomDatabase() {
    abstract fun currencyDao(): FavCurrencyDao

    companion object {
        @Volatile
        private var instance: FavoriteDatabase? = null

        fun getInstance(context: Context): FavoriteDatabase {
            return instance ?: synchronized(this) {
                instance ?: createDatabase(context).also { instance = it }
            }
        }

        private fun createDatabase(context: Context): FavoriteDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                FavoriteDatabase::class.java,
                "favorite_database.db"
            ).build()
        }
    }
}


