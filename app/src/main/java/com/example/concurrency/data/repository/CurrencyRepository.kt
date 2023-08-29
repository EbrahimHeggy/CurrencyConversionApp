package com.example.concurrency.data.repository

import com.example.concurrency.data.local.FavoriteDatabase
import com.example.concurrency.data.remote.CurrencyApi
import com.example.concurrency.data.remote.model.CompareResponse
import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.data.remote.model.FavoriteResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyRepository @Inject constructor(
    private val api: CurrencyApi,
    private val favDao: FavoriteDatabase
) {
    suspend fun getConversionCurrency(
        base: String,
        target: String,
        amount: Double,
    ): ConvertResponse {
        return withContext(Dispatchers.IO) {
            api.getConversionCurrency(
                base, target, amount
            )
        }
    }

    suspend fun getAllCurrencies(): Currencies {
        return withContext(Dispatchers.IO) {
            api.getAllCurrencies()
        }
    }

    suspend fun getComparedCurrency(
        amount: Double,
        base: String,
        target: String,
        target2: String
    ): CompareResponse {
        return withContext(Dispatchers.IO) {
            api.getComparedCurrency(
                amount, base, target, target2
            )
        }
    }

    suspend fun postFavoritesCurrencies(
        base: String,
        currencyCode: List<String>
    ): FavoriteResponse {
        return withContext(Dispatchers.IO) {
            api.postFavoritesCurrencies(base, currencyCode)
        }
    }


    suspend fun insertFavoriteCurrency(currency: DataX) {
        withContext(Dispatchers.IO) {
            favDao.currencyDao().insertCurrency(currency)
        }
    }

    suspend fun deleteCurrency(currency: DataX) {
        withContext(Dispatchers.IO) {
            favDao.currencyDao().deleteCurrency(currency)
        }
    }

    fun getFavoriteCurrencies(): Flow<List<DataX>> {
        return favDao.currencyDao().getAllCurrencies()

    }


}