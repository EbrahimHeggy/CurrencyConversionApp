package com.example.concurrency.data.remote.model

data class CompareResponse(
    val data: DataXX,
    val isSuccess: Boolean,
    val statusCode: Int
)