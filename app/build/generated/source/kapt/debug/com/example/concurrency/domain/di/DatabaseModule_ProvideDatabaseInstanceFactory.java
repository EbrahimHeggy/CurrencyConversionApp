package com.example.concurrency.domain.di;

import android.content.Context;
import com.example.concurrency.data.local.FavoriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDatabaseInstanceFactory implements Factory<FavoriteDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideDatabaseInstanceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FavoriteDatabase get() {
    return provideDatabaseInstance(contextProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseInstanceFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideDatabaseInstanceFactory(contextProvider);
  }

  public static FavoriteDatabase provideDatabaseInstance(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDatabaseInstance(context));
  }
}
