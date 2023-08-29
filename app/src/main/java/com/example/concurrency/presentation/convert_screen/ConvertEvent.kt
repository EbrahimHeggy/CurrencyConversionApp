package com.example.concurrency.presentation.convert_screen

import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.presentation.compare_screen.CompareEvent

sealed interface ConvertEvent {

    data class GetConvertedCurrency(val base: String, val target: String, val amount: Double) :
        ConvertEvent
    data class SetBaseAmount(val amount: String) : ConvertEvent
    data class SetBase(val base: Base) : ConvertEvent
    data class SetTarget(val target: Target) : ConvertEvent
    object InitialScreen : ConvertEvent
    data class InsertCurrency(val currencyEntity: DataX) : ConvertEvent
    data class DeleteCurrency(val currencyEntity: DataX) : ConvertEvent


}

data class Base(
    val base: String,
    val imageUrl: String
)

data class Target(
    val target: String,
    val imageUrl: String
)