// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.di.usecase;

import com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UseCaseModule_ProvideFavoriteDataSourceFactory implements Factory<RecipeFavoriteDataSource> {
  @Override
  public RecipeFavoriteDataSource get() {
    return provideFavoriteDataSource();
  }

  public static UseCaseModule_ProvideFavoriteDataSourceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RecipeFavoriteDataSource provideFavoriteDataSource() {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideFavoriteDataSource());
  }

  private static final class InstanceHolder {
    private static final UseCaseModule_ProvideFavoriteDataSourceFactory INSTANCE = new UseCaseModule_ProvideFavoriteDataSourceFactory();
  }
}