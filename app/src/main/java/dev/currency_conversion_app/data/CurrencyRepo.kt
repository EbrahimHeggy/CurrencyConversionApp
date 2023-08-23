package dev.currency_conversion_app.data

import dev.currency_conversion_app.data.remote.RetrofitClient
import dev.currency_conversion_app.data.remote.api.CurrencyApi
import dev.currency_conversion_app.data.remote.model.BaseToCurrencies
import dev.currency_conversion_app.data.remote.model.PairConvert
import dev.currency_conversion_app.data.remote.model.SupportedCodes

class CurrencyRepository(
    private val api: CurrencyApi = RetrofitClient().currencyApi,
) {
    suspend fun getPairConverter(base: String, target: String, amount: Double, ): PairConvert {
        return api.getPairConverter(base, target, amount)
    }
    suspend fun getBaseToCurrencies(base: String): BaseToCurrencies {
        return api.getBaseToCurrencies(base)
    }
    suspend fun getSupportedCodes(): SupportedCodes {
        return api.getSupportedCodes()
    }
}