package com.example.concurrency.data.repository

import com.example.concurrency.data.remote.CurrencyApi
import com.example.concurrency.data.remote.model.CompareResponse
import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.remote.model.Currencies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class CurrencyRepository @Inject constructor(
    private val api: CurrencyApi
) {
    suspend fun getConversionCurrency(
        base: String,
        target: String,
        amount: Double,

        ): Response<ConvertResponse> {
        return withContext(Dispatchers.IO) {
            api.getConversionCurrency(
               base, target,amount
            )
        }
    }

    suspend fun getAllCurrencies(): Response<Currencies >{
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










}