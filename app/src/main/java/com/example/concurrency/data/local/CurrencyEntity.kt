package com.example.concurrency.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FavCurrencies")
data class CurrencyEntity(
    @PrimaryKey val code: String,
    val imageUrl: String,
    val name: String
)

