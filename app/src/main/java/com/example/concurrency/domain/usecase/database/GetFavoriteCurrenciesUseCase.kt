package com.example.concurrency.domain.usecase.database

import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetFavoriteCurrenciesUseCase @Inject constructor(
    private val repository: CurrencyRepository
) {


     operator fun invoke(): Flow<List<DataX>> = repository.getFavoriteCurrencies()




}