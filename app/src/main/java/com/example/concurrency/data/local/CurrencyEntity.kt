package com.example.concurrency.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fav_currencies")
data class CurrencyEntity(
    @PrimaryKey(autoGenerate = false)
    val code: String,
    val imageUrl: String,
    val name: String
)

