package com.example.concurrency.domain.di;

import com.example.concurrency.data.remote.CurrencyApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideCurrencyApiFactory implements Factory<CurrencyApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideCurrencyApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CurrencyApi get() {
    return provideCurrencyApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideCurrencyApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideCurrencyApiFactory(retrofitProvider);
  }

  public static CurrencyApi provideCurrencyApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCurrencyApi(retrofit));
  }
}
