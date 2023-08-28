package com.example.concurrency.presentation.convert_screen

import com.example.concurrency.data.remote.model.Currencies

data class CurrencyState(
    val currencies: Currencies? = null,
    val amount: String = "", // what you type
    val base: Base = Base("EGP", "https://flagcdn.com/w40/eg.png"), //source
    val target: Target = Target("USD", "https://flagcdn.com/w40/us.png"), //destination
    val resultAmount: String = "",
    val image: String = "",
    val isLoading: Boolean = false,
    val error: String = ""
)
