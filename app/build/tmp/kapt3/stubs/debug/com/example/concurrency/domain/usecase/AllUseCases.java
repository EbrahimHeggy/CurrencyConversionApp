package com.example.concurrency.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/example/concurrency/domain/usecase/AllUseCases;", "", "getConvertCurrencyUseCase", "Lcom/example/concurrency/domain/usecase/network/GetConvertCurrencyUseCase;", "getCompareCurrencyUseCase", "Lcom/example/concurrency/domain/usecase/network/GetCompareCurrencyUseCase;", "getAllCurrenciesUseCase", "Lcom/example/concurrency/domain/usecase/network/GetAllCurrenciesUseCase;", "getFavoriteCurrenciesUseCase", "Lcom/example/concurrency/domain/usecase/database/GetFavoriteCurrenciesUseCase;", "postFavoritesCurrencies", "Lcom/example/concurrency/domain/usecase/network/PostFavoritesCurrencies;", "(Lcom/example/concurrency/domain/usecase/network/GetConvertCurrencyUseCase;Lcom/example/concurrency/domain/usecase/network/GetCompareCurrencyUseCase;Lcom/example/concurrency/domain/usecase/network/GetAllCurrenciesUseCase;Lcom/example/concurrency/domain/usecase/database/GetFavoriteCurrenciesUseCase;Lcom/example/concurrency/domain/usecase/network/PostFavoritesCurrencies;)V", "getGetAllCurrenciesUseCase", "()Lcom/example/concurrency/domain/usecase/network/GetAllCurrenciesUseCase;", "getGetCompareCurrencyUseCase", "()Lcom/example/concurrency/domain/usecase/network/GetCompareCurrencyUseCase;", "getGetConvertCurrencyUseCase", "()Lcom/example/concurrency/domain/usecase/network/GetConvertCurrencyUseCase;", "getGetFavoriteCurrenciesUseCase", "()Lcom/example/concurrency/domain/usecase/database/GetFavoriteCurrenciesUseCase;", "getPostFavoritesCurrencies", "()Lcom/example/concurrency/domain/usecase/network/PostFavoritesCurrencies;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class AllUseCases {
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase getConvertCurrencyUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase getCompareCurrencyUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase getAllCurrenciesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase getFavoriteCurrenciesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies postFavoritesCurrencies = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.AllUseCases copy(@org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase getConvertCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase getCompareCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase getAllCurrenciesUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase getFavoriteCurrenciesUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies postFavoritesCurrencies) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AllUseCases(@org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase getConvertCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase getCompareCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase getAllCurrenciesUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase getFavoriteCurrenciesUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies postFavoritesCurrencies) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase getGetConvertCurrencyUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase getGetCompareCurrencyUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase getGetAllCurrenciesUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase getGetFavoriteCurrenciesUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies getPostFavoritesCurrencies() {
        return null;
    }
}