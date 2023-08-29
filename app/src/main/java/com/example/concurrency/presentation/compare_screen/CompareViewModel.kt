package com.example.concurrency.presentation.compare_screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.concurrency.domain.usecase.AllUseCases
import com.example.concurrency.presentation.convert_screen.CurrencyState
import com.example.concurrency.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CompareViewModel @Inject constructor(
    private val useCases: AllUseCases
) : ViewModel() {

    private val _compareState = MutableStateFlow(CurrencyState())
    val compareState = _compareState.asStateFlow()


    init {
        getAllCurrencies()
    }


    fun onEvent(event: CompareEvent) {
        when (event) {
            is CompareEvent.SetBase -> {
                _compareState.update { it.copy(base = event.base) }
            }

            is CompareEvent.SetBaseAmount -> {
                _compareState.update { it.copy(amount = event.amount) }
            }

            is CompareEvent.SetTarget1 -> {
                _compareState.update { it.copy(target = event.target1) }
            }

            is CompareEvent.GetComparedCurrency -> {
                getComparedCurrencies(
                    event.amount, event.base, event.target1, event.target2
                )
            }

            is CompareEvent.SetTarget2 -> {
                _compareState.update { it.copy(target2 = event.target2) }
            }
        }
    }


    private fun getAllCurrencies() {
        viewModelScope.launch {
            useCases.getAllCurrenciesUseCase().collectLatest { result ->
                when (result) {
                    is Resource.Error -> {
                        _compareState.update { state ->
                            state.copy(error = result.message ?: "", isLoading = false)
                        }
                        Log.e("result Currency", result.data?.data.toString())
                    }

                    is Resource.Loading -> {
                        _compareState.update { it.copy(isLoading = true) }
                        Log.e("result Currency", result.data?.data.toString())

                    }

                    is Resource.Success -> {
                        _compareState.update {
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

    private fun getComparedCurrencies(
        amount: Double,
        base: String,
        target1: String,
        target2: String
    ) {
        viewModelScope.launch {
            useCases.getCompareCurrencyUseCase(
                amount,
                base,
                target1,
                target2
            ).collectLatest { result ->
                when(result) {
                    is Resource.Error -> {
                        _compareState.update {
                            it.copy(
                                error = result.message ?: "",
                                isLoading = false
                            )
                        }
                    }

                    is Resource.Loading -> {
                        _compareState.update { it.copy(isLoading = true) }
                    }

                    is Resource.Success -> {
                        _compareState.update {
                            it.copy(
                                resultAmount = result.data?.data?.amount1.toString(),
                                resultAmount2 = result.data?.data?.amount2.toString(),
                                isLoading = false
                            )
                        }
                    }
                }
            }
        }
    }

}








