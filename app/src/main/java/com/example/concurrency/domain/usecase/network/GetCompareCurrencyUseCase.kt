package com.example.concurrency.domain.usecase.network

import com.example.concurrency.data.remote.model.CompareResponse
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.utils.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCompareCurrencyUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) {


    suspend operator fun invoke(amount: Double,base: String, target: String, target2: String)
            : Flow<Resource<CompareResponse>> = flow {

        try {

            //loading state
            emit(Resource.Loading())
            delay(2000L)

            // success state
            val result = currencyRepository.getComparedCurrency(amount,base, target, target2)
            emit(Resource.Success(result))

        } catch (e: Exception) {
            // error state
            emit(Resource.Error(e.message))

        }
    }


}







