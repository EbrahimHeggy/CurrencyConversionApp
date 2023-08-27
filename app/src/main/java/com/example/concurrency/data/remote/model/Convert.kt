package com.example.concurrency.data.remote.model

data class Convert(
    val data: ConvertData,
    val isSuccess: Boolean,
    val statusCode: Int
)

data class ConvertData(
    val amount: Double,
    val destination: String,
    val source: String
)
