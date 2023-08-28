package com.example.concurrency.data.remote.model

data class ConvertResponse(
    val data: Data,
    val isSuccess: Boolean,
    val statusCode: Int
)