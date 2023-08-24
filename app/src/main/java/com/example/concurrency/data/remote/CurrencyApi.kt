package com.example.concurrency.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {



    @GET("v6/ecf10bab01b34bf0de9636e1/latest/USD")
    suspend fun getCurrency(): Currency







}