package com.example.concurrency.domain.usecase

import com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase
import com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase
import com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase
import com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase
import com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies

data class AllUseCases(
    val getConvertCurrencyUseCase: GetConvertCurrencyUseCase,
    val getCompareCurrencyUseCase: GetCompareCurrencyUseCase,
    val getAllCurrenciesUseCase: GetAllCurrenciesUseCase,
    val getFavoriteCurrenciesUseCase: GetFavoriteCurrenciesUseCase,
    val postFavoritesCurrencies: PostFavoritesCurrencies
)
