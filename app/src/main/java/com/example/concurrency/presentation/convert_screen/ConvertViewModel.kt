package com.example.concurrency.presentation.convert_screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.domain.usecase.AllUseCases
import com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent
import com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyState
import com.example.concurrency.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConvertViewModel @Inject constructor(
    private val useCases: AllUseCases,
    private val repository: CurrencyRepository
    ) : ViewModel() {

    private val _currencyState = MutableStateFlow(CurrencyState())
    val currencyState = _currencyState.asStateFlow()

    private val _favoriteCurrency = MutableStateFlow(FavoriteCurrencyState())
    val favoriteCurrency = _favoriteCurrency.asStateFlow()


    init {

        getAllCurrencies()
    }


    fun onEvent(event: ConvertEvent) {
        when (event) {
            is ConvertEvent.SetBase -> {
                _currencyState.update { it.copy(base = event.base) }
            }

            is ConvertEvent.SetBaseAmount -> {
                _currencyState.update { it.copy(amount = event.amount) }
            }

            is ConvertEvent.SetTarget -> {
                _currencyState.update { it.copy(target = event.target) }
            }

            is ConvertEvent.GetConvertedCurrency -> {
                getConvertedCurrency(event.base, event.target, event.amount)
            }

            is ConvertEvent.GetFavoriteCurrencyRates -> {
                getCurrenciesRate(event.base, event.codes)
            }
        }
    }


    private fun getAllCurrencies() {
        viewModelScope.launch {
            useCases.getAllCurrenciesUseCase().collectLatest { result ->
                when (result) {
                    is Resource.Error -> {
                        _currencyState.update { state ->
                            state.copy(error = result.message ?: "", isLoading = false)
                        }
                        Log.e("result Currency", result.data?.data.toString())
                    }

                    is Resource.Loading -> {
                        _currencyState.update { it.copy(isLoading = true) }
                        Log.e("result Currency", result.data?.data.toString())

                    }

                    is Resource.Success -> {
                        _currencyState.update {
                            it.copy(
                                currencies = result.data,
                                isLoading = false
                            )
                        }
                        Log.e("result Currency", result.data?.data.toString())
                    }
                }

            }
        }
    }

    fun getCurrenciesRate(base: String, codes: List<String>) {
        viewModelScope.launch {
            useCases.postFavoritesCurrencies(base, codes).collect { result ->

                when(result) {
                    is Resource.Error -> {
                        _currencyState.update { state ->
                            state.copy(error = result.message ?: "", isLoading = false)
                        }
                        Log.e("result Currency", result.data?.data.toString())
                    }

                    is Resource.Loading -> {
                        _currencyState.update { it.copy(isLoading = true) }
                        Log.e("result Currency", result.data?.data.toString())

                    }

                    is Resource.Success -> {
                        _currencyState.update {
                            it.copy(
                                currenciesRates = result.data,
                                isLoading = false
                            )
                        }
                        Log.e("result Currency", result.data?.data.toString())
                    }
                }
            }
        }
    }

    private fun getConvertedCurrency(
        base: String,
        target: String,
        amount: Double,
    ) {
        viewModelScope.launch {
            useCases.getConvertCurrencyUseCase(base, target, amount).collectLatest { result ->
                when (result) {
                    is Resource.Error -> {
                        _currencyState.update {
                            it.copy(
                                error = result.message ?: "",
                                isLoading = false
                            )
                        }
                    }

                    is Resource.Loading -> {
                        _currencyState.update { it.copy(isLoading = true) }
                    }

                    is Resource.Success -> {
                        _currencyState.update {
                            it.copy(
                                resultAmount = result.data?.data?.amount.toString(),
                                isLoading = false
                            )
                        }
                    }
                }
            }
        }
    }


    fun onDatabaseEvent(event: FavoriteCurrencyEvent) {
        when (event) {
            is FavoriteCurrencyEvent.DeleteCurrency -> {
                deleteCurrency(event.currencyEntity)
            }

            is FavoriteCurrencyEvent.InsertCurrency -> {
                insertCurrency(event.currencyEntity)
            }

            FavoriteCurrencyEvent.GetFavoriteCurrencies -> {
                getFavoriteCurrency()

            }
        }
    }


    private fun insertCurrency(currencyEntity: DataX) {
        viewModelScope.launch {
            repository.insertFavoriteCurrency(currencyEntity)
        }
    }

    private fun deleteCurrency(currencyEntity: DataX) {
        viewModelScope.launch {
            repository.deleteCurrency(currencyEntity)
        }
    }

    private fun getFavoriteCurrency() {
        viewModelScope.launch {
            useCases.getFavoriteCurrenciesUseCase().collectLatest { result ->
                _favoriteCurrency.update { it.copy(favoriteCurrency = result) }
            }
        }


    }


}















