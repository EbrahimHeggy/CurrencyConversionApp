package com.example.concurrency.domain.usecase

import com.example.concurrency.data.remote.model.ConvertResponse
import com.example.concurrency.data.remote.model.DataXXX
import com.example.concurrency.data.remote.model.FavoritesRates
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.utils.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetFavoritesRatesUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) {


    suspend operator fun invoke(base: String, currencyCodes: List<String> )
            : Flow<Resource<FavoritesRates>> = flow {

        try {
            //loading state
            emit(Resource.Loading())
            delay(2000L)

            // success state
            val result = currencyRepository.getFavRates(base,currencyCodes)
            emit(Resource.Success(result.body()))

        } catch (e: Exception) {
            // error state
            emit(Resource.Error(e.message))
        }
    }
}











