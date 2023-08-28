package com.example.concurrency.domain.usecase

data class AllUseCases(
    val getConvertCurrencyUseCase: GetConvertCurrencyUseCase,
    val getCompareCurrencyUseCase: GetCompareCurrencyUseCase,
    val getAllCurrenciesUseCase: GetAllCurrenciesUseCase
)
