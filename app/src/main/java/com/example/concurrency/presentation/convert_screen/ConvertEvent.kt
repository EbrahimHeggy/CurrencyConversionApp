package com.example.concurrency.presentation.convert_screen

sealed interface ConvertEvent {

    data class GetConvertedCurrency(val base: String, val target: String, val amount: Double) :
        ConvertEvent

    data class GetFavoriteCurrencyRates(val base: String, val codes: List<String>): ConvertEvent

    data class SetBaseAmount(val amount: String) : ConvertEvent
    data class SetBase(val base: Base) : ConvertEvent
    data class SetTarget(val target: Target) : ConvertEvent


}

data class Base(
    val base: String,
    val imageUrl: String
)

data class Target(
    val target: String,
    val imageUrl: String
)