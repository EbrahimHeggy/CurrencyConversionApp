package com.example.concurrency.data.repository;

import com.example.concurrency.data.local.FavoriteDatabase;
import com.example.concurrency.data.remote.CurrencyApi;
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
public final class CurrencyRepository_Factory implements Factory<CurrencyRepository> {
  private final Provider<CurrencyApi> apiProvider;

  private final Provider<FavoriteDatabase> favDaoProvider;

  public CurrencyRepository_Factory(Provider<CurrencyApi> apiProvider,
      Provider<FavoriteDatabase> favDaoProvider) {
    this.apiProvider = apiProvider;
    this.favDaoProvider = favDaoProvider;
  }

  @Override
  public CurrencyRepository get() {
    return newInstance(apiProvider.get(), favDaoProvider.get());
  }

  public static CurrencyRepository_Factory create(Provider<CurrencyApi> apiProvider,
      Provider<FavoriteDatabase> favDaoProvider) {
    return new CurrencyRepository_Factory(apiProvider, favDaoProvider);
  }

  public static CurrencyRepository newInstance(CurrencyApi api, FavoriteDatabase favDao) {
    return new CurrencyRepository(api, favDao);
  }
}
