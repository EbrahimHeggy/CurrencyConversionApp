package com.example.concurrency.data.remote.model

data class Curruncies(
    val data: List<CurrencyData>,
    val isSuccess: Boolean,
    val statusCode: Int
)

data class CurrencyData(
    val code: String,
    val imageUrl: String,
    val name: String
)