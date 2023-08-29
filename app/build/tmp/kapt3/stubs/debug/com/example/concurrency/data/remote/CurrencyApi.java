package com.example.concurrency.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/concurrency/data/remote/CurrencyApi;", "", "getAllCurrencies", "Lcom/example/concurrency/data/remote/model/Currencies;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComparedCurrency", "Lcom/example/concurrency/data/remote/model/CompareResponse;", "amount", "", "base", "", "target", "target2", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversionCurrency", "Lcom/example/concurrency/data/remote/model/ConvertResponse;", "(Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFavoritesCurrencies", "Lcom/example/concurrency/data/remote/model/FavoriteResponse;", "currencyCodes", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CurrencyApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "currency/conversion")
    public abstract java.lang.Object getConversionCurrency(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "from")
    java.lang.String base, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "to1")
    java.lang.String target, @retrofit2.http.Query(value = "amount")
    double amount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.ConvertResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "currency")
    public abstract java.lang.Object getAllCurrencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.Currencies> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "currency/conversion")
    public abstract java.lang.Object getComparedCurrency(@retrofit2.http.Query(value = "amount")
    double amount, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "from")
    java.lang.String base, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "to1")
    java.lang.String target, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "to2")
    java.lang.String target2, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.CompareResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "currency")
    public abstract java.lang.Object postFavoritesCurrencies(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "base")
    java.lang.String base, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    java.util.List<java.lang.String> currencyCodes, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.concurrency.data.remote.model.FavoriteResponse> continuation);
}