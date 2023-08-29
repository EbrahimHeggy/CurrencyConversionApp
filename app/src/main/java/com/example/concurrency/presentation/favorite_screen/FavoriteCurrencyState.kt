package com.example.concurrency.presentation.favorite_screen

import com.example.concurrency.data.remote.model.DataX

data class FavoriteCurrencyState(
    val favoriteCurrency: List<DataX> = emptyList(),
    val error: String = "",
    val isLoading: Boolean = false
)
