package com.example.concurrency.data.remote.model

data class FavoriteRates(
    val data: BaseData,
    val isSuccess: Boolean,
    val statusCode: Int
)


data class BaseData(
    val base: String,
    val currencies: List<FavoriteCurrency>
)

data class FavoriteCurrency(
    val code: String,
    val imageUrl: String,
    val name: String,
    val rate: Double
)
