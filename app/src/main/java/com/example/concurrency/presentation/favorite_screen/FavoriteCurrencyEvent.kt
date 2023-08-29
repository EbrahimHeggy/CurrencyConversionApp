package com.example.concurrency.presentation.favorite_screen

import com.example.concurrency.data.remote.model.DataX

sealed interface FavoriteCurrencyEvent {

    data class InsertCurrency(val currencyEntity: DataX): FavoriteCurrencyEvent
    data class DeleteCurrency(val currencyEntity: DataX): FavoriteCurrencyEvent
    object GetFavoriteCurrencies: FavoriteCurrencyEvent
}