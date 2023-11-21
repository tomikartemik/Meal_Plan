// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.di.usecase;

import com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource;
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
public final class UseCaseModule_ProvideMealDietTypeDataSourceFactory implements Factory<MealDietTypeDataSource> {
  @Override
  public MealDietTypeDataSource get() {
    return provideMealDietTypeDataSource();
  }

  public static UseCaseModule_ProvideMealDietTypeDataSourceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MealDietTypeDataSource provideMealDietTypeDataSource() {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideMealDietTypeDataSource());
  }

  private static final class InstanceHolder {
    private static final UseCaseModule_ProvideMealDietTypeDataSourceFactory INSTANCE = new UseCaseModule_ProvideMealDietTypeDataSourceFactory();
  }
}
