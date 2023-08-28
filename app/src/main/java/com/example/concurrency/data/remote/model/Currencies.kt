package com.example.concurrency.data.remote.model


data class Currencies(
    val data: List<DataX>,
    val isSuccess: Boolean,
    val statusCode: Int
)