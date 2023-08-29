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
public final class PostFavoritesCurrencies_Factory implements Factory<PostFavoritesCurrencies> {
  private final Provider<CurrencyRepository> repositoryProvider;

  public PostFavoritesCurrencies_Factory(Provider<CurrencyRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PostFavoritesCurrencies get() {
    return newInstance(repositoryProvider.get());
  }

  public static PostFavoritesCurrencies_Factory create(
      Provider<CurrencyRepository> repositoryProvider) {
    return new PostFavoritesCurrencies_Factory(repositoryProvider);
  }

  public static PostFavoritesCurrencies newInstance(CurrencyRepository repository) {
    return new PostFavoritesCurrencies(repository);
  }
}
