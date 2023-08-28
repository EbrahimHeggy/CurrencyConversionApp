package com.example.concurrency.data.repository

import com.example.concurrency.data.remote.Currency
import com.example.concurrency.data.remote.CurrencyApi
import javax.inject.Inject

class CurrencyRepository @Inject constructor(
    private val api: CurrencyApi
) {

    suspend fun getCurrency(): Currency {
        return api.getCurrency()
    }



}