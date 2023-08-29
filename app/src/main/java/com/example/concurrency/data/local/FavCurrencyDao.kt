package com.example.concurrency.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.concurrency.data.remote.model.DataX
import kotlinx.coroutines.flow.Flow

@Dao
interface FavCurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrency(currency: DataX)

    @Delete
    suspend fun deleteCurrency(currency: DataX)

    @Query("SELECT * FROM fav_currencies")
    suspend fun getAllCurrencies(): List<DataX>
}
