package com.example.concurrency.presentation.convert_screen

sealed interface ConvertEvent {

    data class GetConvertedCurrency(val amount: Double, val base: String, val target: String): ConvertEvent
    data class SetBaseAmount(val amount: String): ConvertEvent
    data class SetBase(val base: String): ConvertEvent
    data class SetTarget(val target: String): ConvertEvent

}