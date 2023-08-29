package com.example.concurrency.presentation.convert_screen;

import com.example.concurrency.data.repository.CurrencyRepository;
import com.example.concurrency.domain.usecase.AllUseCases;
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
public final class ConvertViewModel_Factory implements Factory<ConvertViewModel> {
  private final Provider<AllUseCases> useCasesProvider;

  private final Provider<CurrencyRepository> repositoryProvider;

  public ConvertViewModel_Factory(Provider<AllUseCases> useCasesProvider,
      Provider<CurrencyRepository> repositoryProvider) {
    this.useCasesProvider = useCasesProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ConvertViewModel get() {
    return newInstance(useCasesProvider.get(), repositoryProvider.get());
  }

  public static ConvertViewModel_Factory create(Provider<AllUseCases> useCasesProvider,
      Provider<CurrencyRepository> repositoryProvider) {
    return new ConvertViewModel_Factory(useCasesProvider, repositoryProvider);
  }

  public static ConvertViewModel newInstance(AllUseCases useCases, CurrencyRepository repository) {
    return new ConvertViewModel(useCases, repository);
  }
}
