package com.example.concurrency.presentation.compare_screen

import com.example.concurrency.presentation.convert_screen.Base
import com.example.concurrency.presentation.convert_screen.Target


sealed interface CompareEvent {
    data class GetComparedCurrency(
        val amount: Double,
        val base: String,
        val target1: String,
        val target2: String,
    ) : CompareEvent

    data class SetBaseAmount(val amount: String) : CompareEvent
    data class SetBase(val base: Base) : CompareEvent
    data class SetTarget1(val target1: Target) : CompareEvent
    data class SetTarget2(val target2: Target) : CompareEvent

}
