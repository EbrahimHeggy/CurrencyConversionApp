package com.example.concurrency.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FavCurrencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrency(currency: CurrencyEntity)

    @Query("DELETE FROM FavCurrencies WHERE code = :currencyCode")
    suspend fun deleteCurrencyByCode(currencyCode: String)

    @Query("SELECT * FROM FavCurrencies")
    suspend fun getAllCurrencies(): List<CurrencyEntity>
}
