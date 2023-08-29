package com.example.concurrency.domain.di;

import com.example.concurrency.data.local.FavoriteDatabase;
import com.example.concurrency.data.remote.CurrencyApi;
import com.example.concurrency.data.repository.CurrencyRepository;
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
public final class NetworkModule_ProvideCurrencyRepositoryFactory implements Factory<CurrencyRepository> {
  private final Provider<CurrencyApi> apiProvider;

  private final Provider<FavoriteDatabase> databaseProvider;

  public NetworkModule_ProvideCurrencyRepositoryFactory(Provider<CurrencyApi> apiProvider,
      Provider<FavoriteDatabase> databaseProvider) {
    this.apiProvider = apiProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public CurrencyRepository get() {
    return provideCurrencyRepository(apiProvider.get(), databaseProvider.get());
  }

  public static NetworkModule_ProvideCurrencyRepositoryFactory create(
      Provider<CurrencyApi> apiProvider, Provider<FavoriteDatabase> databaseProvider) {
    return new NetworkModule_ProvideCurrencyRepositoryFactory(apiProvider, databaseProvider);
  }

  public static CurrencyRepository provideCurrencyRepository(CurrencyApi api,
      FavoriteDatabase database) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCurrencyRepository(api, database));
  }
}
