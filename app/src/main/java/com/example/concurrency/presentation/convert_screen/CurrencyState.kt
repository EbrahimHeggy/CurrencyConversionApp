package com.example.concurrency.presentation.convert_screen

import com.example.concurrency.data.remote.model.Currencies

data class CurrencyState(
    val currencies: Currencies? = null,
    val amount: String = "", // what you type
    val base: String = "", //source
    val target: String ="", //destination
    val resultAmount: String = "",
    val isLoading: Boolean = false,
    val error: String = ""
)
