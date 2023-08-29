package com.example.concurrency.data.remote

import com.example.concurrency.data.remote.model.CompareResponse
import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.remote.model.FavoriteRates
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface CurrencyApi {


    @GET("currency/conversion")
    suspend fun getConversionCurrency(
        @Query("from") base: String,
        @Query("to1") target: String,
        @Query("amount") amount: Double,
    ): ConvertResponse

    @GET("currency")
    suspend fun getAllCurrencies(): Currencies

    @GET("currency/conversion")
    suspend fun getComparedCurrency(
        @Query("amount") amount: Double,
        @Query("from") base: String,
        @Query("to1") target: String,
        @Query("to2") target2: String,
    ): CompareResponse

    @POST("currency")
    suspend fun postFavoritesCurrencies(
        @Query("base") base: String,
        @Body currencyCodes: List<String>
    ): FavoriteRates






}