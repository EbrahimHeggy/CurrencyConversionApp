package com.example.concurrency.presentation.compare_screen;

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
public final class CompareViewModel_Factory implements Factory<CompareViewModel> {
  private final Provider<AllUseCases> useCasesProvider;

  public CompareViewModel_Factory(Provider<AllUseCases> useCasesProvider) {
    this.useCasesProvider = useCasesProvider;
  }

  @Override
  public CompareViewModel get() {
    return newInstance(useCasesProvider.get());
  }

  public static CompareViewModel_Factory create(Provider<AllUseCases> useCasesProvider) {
    return new CompareViewModel_Factory(useCasesProvider);
  }

  public static CompareViewModel newInstance(AllUseCases useCases) {
    return new CompareViewModel(useCases);
  }
}
