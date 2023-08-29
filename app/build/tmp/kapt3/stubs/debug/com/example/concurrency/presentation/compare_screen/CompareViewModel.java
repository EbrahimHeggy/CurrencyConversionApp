package com.example.concurrency.presentation.compare_screen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/example/concurrency/domain/usecase/AllUseCases;", "(Lcom/example/concurrency/domain/usecase/AllUseCases;)V", "_compareState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/concurrency/presentation/convert_screen/CurrencyState;", "compareState", "Lkotlinx/coroutines/flow/StateFlow;", "getCompareState", "()Lkotlinx/coroutines/flow/StateFlow;", "getAllCurrencies", "", "getComparedCurrencies", "amount", "", "base", "", "target1", "target2", "onEvent", "event", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "app_debug"})
public final class CompareViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.concurrency.domain.usecase.AllUseCases useCases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> _compareState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> compareState = null;
    
    @javax.inject.Inject
    public CompareViewModel(@org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.AllUseCases useCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.concurrency.presentation.convert_screen.CurrencyState> getCompareState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.compare_screen.CompareEvent event) {
    }
    
    private final void getAllCurrencies() {
    }
    
    private final void getComparedCurrencies(double amount, java.lang.String base, java.lang.String target1, java.lang.String target2) {
    }
}