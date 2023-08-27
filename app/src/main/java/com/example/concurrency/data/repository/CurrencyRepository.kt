package com.example.concurrency.data.repository

import com.example.concurrency.data.remote.api.CurrencyApi
import javax.inject.Inject

class CurrencyRepository @Inject constructor(
    private val api: CurrencyApi
) {

}