package com.example.concurrency.data.remote.model

data class Compare(
    val data: CompareData,
    val isSuccess: Boolean,
    val statusCode: Int
)

data class CompareData(
    val amount1: Double,
    val amount2: Double,
    val destination1: String,
    val destination2: String,
    val source: String
)