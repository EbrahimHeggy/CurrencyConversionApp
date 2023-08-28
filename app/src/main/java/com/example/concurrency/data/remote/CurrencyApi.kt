package com.example.concurrency.data.remote

import com.example.concurrency.data.remote.model.CompareResponse
import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.remote.model.Currencies
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {


    @GET("v1/currency/conversion?")
    suspend fun getConversionCurrency(
        @Query("amount") amount: Double,
        @Query("from") base: String,
        @Query("to1") target: String
    ): ConvertResponse

    @GET("v1/currency")
    suspend fun getAllCurrencies():Currencies

    @GET("v1/currency/conversion?")
    suspend fun getComparedCurrency(
        @Query("amount") amount: Double,
        @Query("from") base: String,
        @Query("to1") target: String,
        @Query("to2") target2: String,
    ): CompareResponse







}