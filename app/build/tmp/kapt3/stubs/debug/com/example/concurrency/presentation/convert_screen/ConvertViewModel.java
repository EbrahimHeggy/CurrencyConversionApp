package com.example.concurrency.presentation.convert_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fH\u0002J\b\u0010\u0011\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020%R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/example/concurrency/domain/usecase/AllUseCases;", "repository", "Lcom/example/concurrency/data/repository/CurrencyRepository;", "(Lcom/example/concurrency/domain/usecase/AllUseCases;Lcom/example/concurrency/data/repository/CurrencyRepository;)V", "_currencyState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/concurrency/presentation/convert_screen/CurrencyState;", "_favoriteCurrency", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyState;", "currencyState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrencyState", "()Lkotlinx/coroutines/flow/StateFlow;", "favoriteCurrency", "getFavoriteCurrency", "deleteCurrency", "", "currencyEntity", "Lcom/example/concurrency/data/remote/model/DataX;", "getAllCurrencies", "getConvertedCurrency", "base", "", "target", "amount", "", "getCurrenciesRate", "codes", "", "insertCurrency", "onDatabaseEvent", "event", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent;", "onEvent", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "app_debug"})
public final class ConvertViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.concurrency.domain.usecase.AllUseCases useCases = null;
    private final com.example.concurrency.data.repository.CurrencyRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> _currencyState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> currencyState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyState> _favoriteCurrency = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyState> favoriteCurrency = null;
    
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
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyState> getFavoriteCurrency() {
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
    
    public final void onDatabaseEvent(@org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent event) {
    }
    
    private final void insertCurrency(com.example.concurrency.data.remote.model.DataX currencyEntity) {
    }
    
    private final void deleteCurrency(com.example.concurrency.data.remote.model.DataX currencyEntity) {
    }
    
    private final void getFavoriteCurrency() {
    }
}