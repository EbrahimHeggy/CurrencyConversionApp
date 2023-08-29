package com.example.concurrency.domain.usecase.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/concurrency/domain/usecase/network/PostFavoritesCurrencies;", "", "repository", "Lcom/example/concurrency/data/repository/CurrencyRepository;", "(Lcom/example/concurrency/data/repository/CurrencyRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/concurrency/utils/Resource;", "Lcom/example/concurrency/data/remote/model/FavoriteResponse;", "base", "", "currencyCode", "", "app_debug"})
public final class PostFavoritesCurrencies {
    private final com.example.concurrency.data.repository.CurrencyRepository repository = null;
    
    @javax.inject.Inject
    public PostFavoritesCurrencies(@org.jetbrains.annotations.NotNull
    com.example.concurrency.data.repository.CurrencyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.concurrency.utils.Resource<com.example.concurrency.data.remote.model.FavoriteResponse>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> currencyCode) {
        return null;
    }
}