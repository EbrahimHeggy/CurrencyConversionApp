package com.example.concurrency.domain.usecase.network

import android.util.Log
import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.remote.model.FavoriteResponse
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostFavoritesCurrencies @Inject constructor(
    private val repository: CurrencyRepository
) {

    operator fun invoke(
        base: String,
        currencyCode: List<String>
    ): Flow<Resource<FavoriteResponse>> = flow {

        try {

            //loading state
            emit(Resource.Loading())

            // success state
            val result = repository.postFavoritesCurrencies(base, currencyCode)
            emit(Resource.Success(result))


        } catch (e: Exception) {
            // error state
            Log.e("success currencies", e.message.toString())

            emit(Resource.Error(e.message.toString()))


        }
    }


}