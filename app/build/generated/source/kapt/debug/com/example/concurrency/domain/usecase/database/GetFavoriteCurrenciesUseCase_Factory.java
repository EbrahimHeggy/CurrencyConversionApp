package com.example.concurrency.domain.usecase.database;

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
public final class GetFavoriteCurrenciesUseCase_Factory implements Factory<GetFavoriteCurrenciesUseCase> {
  private final Provider<CurrencyRepository> repositoryProvider;

  public GetFavoriteCurrenciesUseCase_Factory(Provider<CurrencyRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetFavoriteCurrenciesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetFavoriteCurrenciesUseCase_Factory create(
      Provider<CurrencyRepository> repositoryProvider) {
    return new GetFavoriteCurrenciesUseCase_Factory(repositoryProvider);
  }

  public static GetFavoriteCurrenciesUseCase newInstance(CurrencyRepository repository) {
    return new GetFavoriteCurrenciesUseCase(repository);
  }
}
