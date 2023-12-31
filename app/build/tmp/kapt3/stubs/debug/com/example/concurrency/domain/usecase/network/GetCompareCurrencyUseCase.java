package com.example.concurrency.domain.usecase.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/concurrency/domain/usecase/network/GetCompareCurrencyUseCase;", "", "currencyRepository", "Lcom/example/concurrency/data/repository/CurrencyRepository;", "(Lcom/example/concurrency/data/repository/CurrencyRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/concurrency/utils/Resource;", "Lcom/example/concurrency/data/remote/model/CompareResponse;", "amount", "", "base", "", "target", "target2", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetCompareCurrencyUseCase {
    private final com.example.concurrency.data.repository.CurrencyRepository currencyRepository = null;
    
    @javax.inject.Inject
    public GetCompareCurrencyUseCase(@org.jetbrains.annotations.NotNull
    com.example.concurrency.data.repository.CurrencyRepository currencyRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(double amount, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    java.lang.String target, @org.jetbrains.annotations.NotNull
    java.lang.String target2, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.concurrency.utils.Resource<com.example.concurrency.data.remote.model.CompareResponse>>> continuation) {
        return null;
    }
}