package com.example.concurrency.presentation.convert_screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.domain.usecase.AllUseCases
import com.example.concurrency.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
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



    init {
        onEvent(ConvertEvent.InitialScreen)
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

            ConvertEvent.InitialScreen -> {
                getAllCurrencies()
                getFavoriteCurrency()
            }

            is ConvertEvent.DeleteCurrency -> {
                deleteCurrency(event.currencyEntity)
            }

            is ConvertEvent.InsertCurrency -> {
                insertCurrency(event.currencyEntity)

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

    private fun getCurrenciesRate(base: String, codes: List<DataX>) {
        viewModelScope.launch {

            val codeList = codes.map { it.code }

            useCases.postFavoritesCurrencies(base, codeList).collect { result ->

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
                                isLoading = false,
                            )
                        }
                        _currencyState.update {
                            it.copy(
                                favoriteCurrency = codes
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
                getCurrenciesRate(_currencyState.value.base.base, result)
            }
        }


    }


}















