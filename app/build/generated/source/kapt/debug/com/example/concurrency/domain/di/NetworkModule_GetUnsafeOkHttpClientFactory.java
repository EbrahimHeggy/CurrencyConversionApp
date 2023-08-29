package com.example.concurrency.domain.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

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
public final class NetworkModule_GetUnsafeOkHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return getUnsafeOkHttpClient();
  }

  public static NetworkModule_GetUnsafeOkHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient getUnsafeOkHttpClient() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.getUnsafeOkHttpClient());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_GetUnsafeOkHttpClientFactory INSTANCE = new NetworkModule_GetUnsafeOkHttpClientFactory();
  }
}
