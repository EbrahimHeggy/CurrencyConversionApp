package com.example.concurrency.presentation.convert_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/example/concurrency/domain/usecase/AllUseCases;", "repository", "Lcom/example/concurrency/data/repository/CurrencyRepository;", "(Lcom/example/concurrency/domain/usecase/AllUseCases;Lcom/example/concurrency/data/repository/CurrencyRepository;)V", "_currencyState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/concurrency/presentation/convert_screen/CurrencyState;", "currencyState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrencyState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteCurrency", "", "currencyEntity", "Lcom/example/concurrency/data/remote/model/DataX;", "getAllCurrencies", "getConvertedCurrency", "base", "", "target", "amount", "", "getCurrenciesRate", "codes", "", "getFavoriteCurrency", "insertCurrency", "onEvent", "event", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "app_debug"})
public final class ConvertViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.concurrency.domain.usecase.AllUseCases useCases = null;
    private final com.example.concurrency.data.repository.CurrencyRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> _currencyState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> currencyState = null;
    
    @javax.inject.Inject
    public ConvertViewModel(@org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.AllUseCases useCases, @org.jetbrains.annotations.NotNull
    com.example.concurrency.data.repository.CurrencyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> getCurrencyState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.ConvertEvent event) {
    }
    
    private final void getAllCurrencies() {
    }
    
    private final void getCurrenciesRate(java.lang.String base, java.util.List<com.example.concurrency.data.remote.model.DataX> codes) {
    }
    
    private final void getConvertedCurrency(java.lang.String base, java.lang.String target, double amount) {
    }
    
    private final void insertCurrency(com.example.concurrency.data.remote.model.DataX currencyEntity) {
    }
    
    private final void deleteCurrency(com.example.concurrency.data.remote.model.DataX currencyEntity) {
    }
    
    private final void getFavoriteCurrency() {
    }
}