package com.example.concurrency.domain.usecase

import android.util.Log
import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.utils.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetAllCurrenciesUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) {

     operator fun invoke(): Flow<Resource<Currencies>> = flow {

        try {

            //loading state
            emit(Resource.Loading())

            // success state
            val result = currencyRepository.getAllCurrencies()
           Log.e("success currencies", result.toString())
            emit(Resource.Success(result))


        } catch (e: Exception) {
            // error state
            Log.e("success currencies", e.message.toString())

            emit(Resource.Error(e.message.toString()))


        }
    }


}











