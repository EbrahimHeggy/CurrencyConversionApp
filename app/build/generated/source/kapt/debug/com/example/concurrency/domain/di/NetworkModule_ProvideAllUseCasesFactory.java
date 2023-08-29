package com.example.concurrency.domain.di;

import com.example.concurrency.domain.usecase.AllUseCases;
import com.example.concurrency.domain.usecase.database.GetFavoriteCurrenciesUseCase;
import com.example.concurrency.domain.usecase.network.GetAllCurrenciesUseCase;
import com.example.concurrency.domain.usecase.network.GetCompareCurrencyUseCase;
import com.example.concurrency.domain.usecase.network.GetConvertCurrencyUseCase;
import com.example.concurrency.domain.usecase.network.PostFavoritesCurrencies;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideAllUseCasesFactory implements Factory<AllUseCases> {
  private final Provider<GetConvertCurrencyUseCase> getConvertCurrencyUseCaseProvider;

  private final Provider<GetCompareCurrencyUseCase> getCompareCurrencyUseCaseProvider;

  private final Provider<GetAllCurrenciesUseCase> getAllCurrenciesUseCaseProvider;

  private final Provider<GetFavoriteCurrenciesUseCase> getFavoriteCurrenciesUseCaseProvider;

  private final Provider<PostFavoritesCurrencies> postFavoritesCurrenciesProvider;

  public NetworkModule_ProvideAllUseCasesFactory(
      Provider<GetConvertCurrencyUseCase> getConvertCurrencyUseCaseProvider,
      Provider<GetCompareCurrencyUseCase> getCompareCurrencyUseCaseProvider,
      Provider<GetAllCurrenciesUseCase> getAllCurrenciesUseCaseProvider,
      Provider<GetFavoriteCurrenciesUseCase> getFavoriteCurrenciesUseCaseProvider,
      Provider<PostFavoritesCurrencies> postFavoritesCurrenciesProvider) {
    this.getConvertCurrencyUseCaseProvider = getConvertCurrencyUseCaseProvider;
    this.getCompareCurrencyUseCaseProvider = getCompareCurrencyUseCaseProvider;
    this.getAllCurrenciesUseCaseProvider = getAllCurrenciesUseCaseProvider;
    this.getFavoriteCurrenciesUseCaseProvider = getFavoriteCurrenciesUseCaseProvider;
    this.postFavoritesCurrenciesProvider = postFavoritesCurrenciesProvider;
  }

  @Override
  public AllUseCases get() {
    return provideAllUseCases(getConvertCurrencyUseCaseProvider.get(), getCompareCurrencyUseCaseProvider.get(), getAllCurrenciesUseCaseProvider.get(), getFavoriteCurrenciesUseCaseProvider.get(), postFavoritesCurrenciesProvider.get());
  }

  public static NetworkModule_ProvideAllUseCasesFactory create(
      Provider<GetConvertCurrencyUseCase> getConvertCurrencyUseCaseProvider,
      Provider<GetCompareCurrencyUseCase> getCompareCurrencyUseCaseProvider,
      Provider<GetAllCurrenciesUseCase> getAllCurrenciesUseCaseProvider,
      Provider<GetFavoriteCurrenciesUseCase> getFavoriteCurrenciesUseCaseProvider,
      Provider<PostFavoritesCurrencies> postFavoritesCurrenciesProvider) {
    return new NetworkModule_ProvideAllUseCasesFactory(getConvertCurrencyUseCaseProvider, getCompareCurrencyUseCaseProvider, getAllCurrenciesUseCaseProvider, getFavoriteCurrenciesUseCaseProvider, postFavoritesCurrenciesProvider);
  }

  public static AllUseCases provideAllUseCases(GetConvertCurrencyUseCase getConvertCurrencyUseCase,
      GetCompareCurrencyUseCase getCompareCurrencyUseCase,
      GetAllCurrenciesUseCase getAllCurrenciesUseCase,
      GetFavoriteCurrenciesUseCase getFavoriteCurrenciesUseCase,
      PostFavoritesCurrencies postFavoritesCurrencies) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAllUseCases(getConvertCurrencyUseCase, getCompareCurrencyUseCase, getAllCurrenciesUseCase, getFavoriteCurrenciesUseCase, postFavoritesCurrencies));
  }
}
