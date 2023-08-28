package com.example.concurrency.presentation.convert_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.concurrency.domain.usecase.AllUseCases
import com.example.concurrency.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConvertViewModel @Inject constructor(
    private val useCases: AllUseCases
) : ViewModel() {


    private val _currencyState = MutableStateFlow(CurrencyState())
    val currencyState = _currencyState.asStateFlow()

    init {
        getAllCurrencies()
    }


    fun onEvent(event: ConvertEvent) {
        when(event) {
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
                getConvertedCurrency(event.amount, event.base, event.target)
            }
        }
    }


    private fun getAllCurrencies() {
        viewModelScope.launch {
            useCases.getAllCurrenciesUseCase().onEach { result ->
                when(result) {
                    is Resource.Error -> {
                        _currencyState.update { state ->
                            state.copy(error = result.message ?: "")
                        }
                    }
                    is Resource.Loading -> {
                        _currencyState.update { it.copy(isLoading = true) }
                    }
                    is Resource.Success -> {
                        _currencyState.update { it.copy(currencies = result.data) }
                    }
                }
            }
        }
    }

    private fun getConvertedCurrency(
        amount: Double,
        base: String,
        target: String
    ) {
        viewModelScope.launch {
            useCases.getConvertCurrencyUseCase(amount, base, target).onEach { result ->
                when(result) {
                    is Resource.Error -> {
                        _currencyState.update { it.copy(error = result.message ?: "") }
                    }
                    is Resource.Loading -> {
                        _currencyState.update { it.copy(isLoading = true) }
                    }
                    is Resource.Success -> {
                        _currencyState.update {
                            it.copy(resultAmount = result.data?.data?.amount.toString())
                        }
                    }
                }
            }
        }
    }


}

























