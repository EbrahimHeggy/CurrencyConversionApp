package dev.currency_conversion_app.data.remote.api

import dev.currency_conversion_app.data.remote.model.BaseToCurrencies
import dev.currency_conversion_app.data.remote.model.PairConvert
import dev.currency_conversion_app.data.remote.model.SupportedCodes
import retrofit2.http.GET
import retrofit2.http.Path

interface CurrencyApi {

    companion object{
        const val BASE_URL = "https://v6.exchangerate-api.com/v6/"
        const val API_KEY = "ecf10bab01b34bf0de9636e1"
    }

    @GET("$API_KEY/pair/{Base}/{Target}/{AMOUNT}")
    suspend fun getPairConverter(
        @Path("Base") base:String,
        @Path("Target") target:String,
        @Path("AMOUNT") amount:Double,
    ): PairConvert

    @GET("$API_KEY/latest/{Base}")
    suspend fun getBaseToCurrencies(
        @Path("Base") base:String,
    ): BaseToCurrencies

    @GET("$API_KEY/codes")
    suspend fun getSupportedCodes(): SupportedCodes

}

