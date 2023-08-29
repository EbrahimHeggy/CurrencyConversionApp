package com.example.concurrency.presentation.convert_screen

import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.remote.model.FavoriteResponse

data class CurrencyState(
    val currencies: Currencies? = null,
    val currenciesRates: FavoriteResponse? = null,
    val amount: String = "", // what you type
    val base: Base = Base("EGP", "https://flagcdn.com/w40/eg.png"), //source
    val target: Target = Target("USD", "https://flagcdn.com/w40/us.png"), //destination
    val target2: Target = Target("USD", "https://flagcdn.com/w40/us.png"), //destination
    val resultAmount: String = "",
    val resultAmount2: String = "",
    val isLoading: Boolean = false,
    val error: String = ""
)
