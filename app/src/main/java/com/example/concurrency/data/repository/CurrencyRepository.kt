package com.example.concurrency.data.repository

import com.example.concurrency.data.local.CurrencyEntity
import com.example.concurrency.data.local.FavoriteDatabase
import com.example.concurrency.data.remote.CurrencyApi
import com.example.concurrency.data.remote.model.CompareResponse
import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.remote.model.FavoriteRates
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyRepository @Inject constructor(
    private val api: CurrencyApi,

) {
    suspend fun getConversionCurrency(
        base: String,
        target: String,
        amount: Double,
        ): ConvertResponse {
        return withContext(Dispatchers.IO) {
            api.getConversionCurrency(
               base, target,amount
            )
        }
    }

    suspend fun getAllCurrencies(): Currencies{
        return withContext(Dispatchers.IO){
            api.getAllCurrencies()
        }
    }

    suspend fun getComparedCurrency(
        amount: Double,
        base: String,
        target: String,
        target2: String
    ): CompareResponse {
        return withContext(Dispatchers.IO){
            api.getComparedCurrency(
                amount,base, target, target2
            )
        }
    }


    suspend fun getFavRates(
        base: String,
        currencyCodes: List<String>
    ): FavoriteRates {
        return withContext(Dispatchers.IO) {
            api.postFavoritesCurrencies(
                base,currencyCodes
            )
        }
    }

}