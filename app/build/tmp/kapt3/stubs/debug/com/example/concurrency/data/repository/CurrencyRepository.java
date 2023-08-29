package com.example.concurrency.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J)\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001d0\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/concurrency/data/repository/CurrencyRepository;", "", "api", "Lcom/example/concurrency/data/remote/CurrencyApi;", "favDao", "Lcom/example/concurrency/data/local/FavoriteDatabase;", "(Lcom/example/concurrency/data/remote/CurrencyApi;Lcom/example/concurrency/data/local/FavoriteDatabase;)V", "deleteCurrency", "", "currency", "Lcom/example/concurrency/data/remote/model/DataX;", "(Lcom/example/concurrency/data/remote/model/DataX;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCurrencies", "Lcom/example/concurrency/data/remote/model/Currencies;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComparedCurrency", "Lcom/example/concurrency/data/remote/model/CompareResponse;", "amount", "", "base", "", "target", "target2", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversionCurrency", "Lcom/example/concurrency/data/remote/model/ConvertResponse;", "(Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteCurrencies", "Lkotlinx/coroutines/flow/Flow;", "", "insertFavoriteCurrency", "postFavoritesCurrencies", "Lcom/example/concurrency/data/remote/model/FavoriteResponse;", "currencyCode", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CurrencyRepository {
    private final com.example.concurrency.data.remote.CurrencyApi api = null;
    private final com.example.concurrency.data.local.FavoriteDatabase favDao = null;
    
    @javax.inject.Inject
    public CurrencyRepository(@org.jetbrains.annotations.NotNull
    com.example.concurrency.data.remote.CurrencyApi api, @org.jetbrains.annotations.NotNull
    com.example.concurrency.data.local.FavoriteDatabase favDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getConversionCurrency(@org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    java.lang.String target, double amount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.ConvertResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllCurrencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.Currencies> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getComparedCurrency(double amount, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    java.lang.String target, @org.jetbrains.annotations.NotNull
    java.lang.String target2, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.CompareResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object postFavoritesCurrencies(@org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> currencyCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.FavoriteResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertFavoriteCurrency(@org.jetbrains.annotations.NotNull
    com.example.concurrency.data.remote.model.DataX currency, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteCurrency(@org.jetbrains.annotations.NotNull
    com.example.concurrency.data.remote.model.DataX currency, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.concurrency.data.remote.model.DataX>> getFavoriteCurrencies() {
        return null;
    }
}