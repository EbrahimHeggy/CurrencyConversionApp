package com.example.concurrency.domain.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0004H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/example/concurrency/domain/di/NetworkModule;", "", "()V", "getUnsafeOkHttpClient", "Lokhttp3/OkHttpClient;", "provideAllUseCases", "Lcom/example/concurrency/domain/usecase/AllUseCases;", "getConvertCurrencyUseCase", "Lcom/example/concurrency/domain/usecase/network/GetConvertCurrencyUseCase;", "getCompareCurrencyUseCase", "Lcom/example/concurrency/domain/usecase/network/GetCompareCurrencyUseCase;", "getAllCurrenciesUseCase", "Lcom/example/concurrency/domain/usecase/network/GetAllCurrenciesUseCase;", "getFavoriteCurrenciesUseCase", "Lcom/example/concurrency/domain/usecase/database/GetFavoriteCurrenciesUseCase;", "postFavoritesCurrencies", "Lcom/example/concurrency/domain/usecase/network/PostFavoritesCurrencies;", "provideCurrencyApi", "Lcom/example/concurrency/data/remote/CurrencyApi;", "retrofit", "Lretrofit2/Retrofit;", "provideCurrencyRepository", "Lcom/example/concurrency/data/repository/CurrencyRepository;", "api", "database", "Lcom/example/concurrency/data/local/FavoriteDatabase;", "provideRetrofitInstance", "okHttpClient", "app_debug"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.concurrency.domain.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient getUnsafeOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofitInstance(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.concurrency.data.remote.CurrencyApi provideCurrencyApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.concurrency.data.repository.CurrencyRepository provideCurrencyRepository(@org.jetbrains.annotations.NotNull
    com.example.concurrency.data.remote.CurrencyApi api, @org.jetbrains.annotations.NotNull
    com.example.concurrency.data.local.FavoriteDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.concurrency.domain.usecase.AllUseCases provideAllUseCases(@org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase getConvertCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase getCompareCurrencyUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase getAllCurrenciesUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase getFavoriteCurrenciesUseCase, @org.jetbrains.annotations.NotNull
    com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies postFavoritesCurrencies) {
        return null;
    }
}