package com.example.concurrency.domain.usecase

import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.utils.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetConvertCurrencyUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) {


     operator fun invoke(base: String, target: String,amount: Double)
            : Flow<Resource<ConvertResponse>> = flow {

        try {
            //loading state
            emit(Resource.Loading())
            delay(2000L)

            // success state
            val result = currencyRepository.getConversionCurrency(base, target, amount)
            emit(Resource.Success(result))

        } catch (e: Exception) {
            // error state
            emit(Resource.Error(e.message))
        }
    }
}











