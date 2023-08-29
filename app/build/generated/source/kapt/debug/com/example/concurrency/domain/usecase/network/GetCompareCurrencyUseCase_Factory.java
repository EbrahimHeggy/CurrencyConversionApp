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
public final class GetCompareCurrencyUseCase_Factory implements Factory<GetCompareCurrencyUseCase> {
  private final Provider<CurrencyRepository> currencyRepositoryProvider;

  public GetCompareCurrencyUseCase_Factory(
      Provider<CurrencyRepository> currencyRepositoryProvider) {
    this.currencyRepositoryProvider = currencyRepositoryProvider;
  }

  @Override
  public GetCompareCurrencyUseCase get() {
    return newInstance(currencyRepositoryProvider.get());
  }

  public static GetCompareCurrencyUseCase_Factory create(
      Provider<CurrencyRepository> currencyRepositoryProvider) {
    return new GetCompareCurrencyUseCase_Factory(currencyRepositoryProvider);
  }

  public static GetCompareCurrencyUseCase newInstance(CurrencyRepository currencyRepository) {
    return new GetCompareCurrencyUseCase(currencyRepository);
  }
}
