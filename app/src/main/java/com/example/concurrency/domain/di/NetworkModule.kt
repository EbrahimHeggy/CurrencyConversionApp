package com.example.concurrency.domain.di

import com.example.concurrency.data.remote.CurrencyApi
import com.example.concurrency.data.repository.CurrencyRepository
import com.example.concurrency.domain.usecase.AllUseCases
import com.example.concurrency.domain.usecase.GetAllCurrenciesUseCase
import com.example.concurrency.domain.usecase.GetCompareCurrencyUseCase
import com.example.concurrency.domain.usecase.GetConvertCurrencyUseCase
import com.example.concurrency.utils.Constant.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Provides
    @Singleton
    fun getUnsafeOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val builder = OkHttpClient.Builder()
        builder.addInterceptor(interceptor)
        return builder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Provides
    @Singleton
    fun provideCurrencyApi(retrofit: Retrofit): CurrencyApi {
        return retrofit.create(CurrencyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCurrencyRepository(
        api: CurrencyApi
    ): CurrencyRepository {
        return CurrencyRepository(api)
    }


    @Provides
    @Singleton
    fun provideAllUseCases(
        getConvertCurrencyUseCase: GetConvertCurrencyUseCase,
        getCompareCurrencyUseCase: GetCompareCurrencyUseCase,
        getAllCurrenciesUseCase: GetAllCurrenciesUseCase
    ): AllUseCases {
        return AllUseCases(
            getConvertCurrencyUseCase = getConvertCurrencyUseCase,
            getCompareCurrencyUseCase = getCompareCurrencyUseCase,
            getAllCurrenciesUseCase = getAllCurrenciesUseCase
        )
    }








}