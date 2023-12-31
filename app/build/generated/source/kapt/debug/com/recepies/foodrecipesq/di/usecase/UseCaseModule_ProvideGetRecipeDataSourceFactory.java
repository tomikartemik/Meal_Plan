// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.di.usecase;

import com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource;
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
public final class UseCaseModule_ProvideGetRecipeDataSourceFactory implements Factory<GetRecipeDataSource> {
  @Override
  public GetRecipeDataSource get() {
    return provideGetRecipeDataSource();
  }

  public static UseCaseModule_ProvideGetRecipeDataSourceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GetRecipeDataSource provideGetRecipeDataSource() {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetRecipeDataSource());
  }

  private static final class InstanceHolder {
    private static final UseCaseModule_ProvideGetRecipeDataSourceFactory INSTANCE = new UseCaseModule_ProvideGetRecipeDataSourceFactory();
  }
}
