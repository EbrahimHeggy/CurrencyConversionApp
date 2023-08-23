package dev.currency_conversion_app.data.remote

import dev.currency_conversion_app.data.remote.api.CurrencyApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
       private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(CurrencyApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

    val currencyApi: CurrencyApi by lazy {
        retrofit.create(CurrencyApi::class.java)
    }
}