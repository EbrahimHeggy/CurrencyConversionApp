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
public final class GetAllCurrenciesUseCase_Factory implements Factory<GetAllCurrenciesUseCase> {
  private final Provider<CurrencyRepository> currencyRepositoryProvider;

  public GetAllCurrenciesUseCase_Factory(Provider<CurrencyRepository> currencyRepositoryProvider) {
    this.currencyRepositoryProvider = currencyRepositoryProvider;
  }

  @Override
  public GetAllCurrenciesUseCase get() {
    return newInstance(currencyRepositoryProvider.get());
  }

  public static GetAllCurrenciesUseCase_Factory create(
      Provider<CurrencyRepository> currencyRepositoryProvider) {
    return new GetAllCurrenciesUseCase_Factory(currencyRepositoryProvider);
  }

  public static GetAllCurrenciesUseCase newInstance(CurrencyRepository currencyRepository) {
    return new GetAllCurrenciesUseCase(currencyRepository);
  }
}
