package com.example.concurrency.data.remote.api

import retrofit2.http.GET

interface CurrencyApi {

    @GET("v6/ecf10bab01b34bf0de9636e1/latest/USD")
    suspend fun getCurrency()


}