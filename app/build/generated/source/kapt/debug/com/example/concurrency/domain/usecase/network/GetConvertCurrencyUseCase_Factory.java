package com.example.concurrency.domain.usecase.network;

import com.example.concurrency.data.repository.CurrencyRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class GetConvertCurrencyUseCase_Factory implements Factory<GetConvertCurrencyUseCase> {
  private final Provider<CurrencyRepository> currencyRepositoryProvider;

  public GetConvertCurrencyUseCase_Factory(
      Provider<CurrencyRepository> currencyRepositoryProvider) {
    this.currencyRepositoryProvider = currencyRepositoryProvider;
  }

  @Override
  public GetConvertCurrencyUseCase get() {
    return newInstance(currencyRepositoryProvider.get());
  }

  public static GetConvertCurrencyUseCase_Factory create(
      Provider<CurrencyRepository> currencyRepositoryProvider) {
    return new GetConvertCurrencyUseCase_Factory(currencyRepositoryProvider);
  }

  public static GetConvertCurrencyUseCase newInstance(CurrencyRepository currencyRepository) {
    return new GetConvertCurrencyUseCase(currencyRepository);
  }
}
