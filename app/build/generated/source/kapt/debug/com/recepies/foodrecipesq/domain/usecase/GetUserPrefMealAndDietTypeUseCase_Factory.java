// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.domain.usecase;

import com.recepies.foodrecipesq.domain.repository.GetUserPrefRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetUserPrefMealAndDietTypeUseCase_Factory implements Factory<GetUserPrefMealAndDietTypeUseCase> {
  private final Provider<GetUserPrefRepository> getUserPrefRepositoryProvider;

  public GetUserPrefMealAndDietTypeUseCase_Factory(
      Provider<GetUserPrefRepository> getUserPrefRepositoryProvider) {
    this.getUserPrefRepositoryProvider = getUserPrefRepositoryProvider;
  }

  @Override
  public GetUserPrefMealAndDietTypeUseCase get() {
    return newInstance(getUserPrefRepositoryProvider.get());
  }

  public static GetUserPrefMealAndDietTypeUseCase_Factory create(
      Provider<GetUserPrefRepository> getUserPrefRepositoryProvider) {
    return new GetUserPrefMealAndDietTypeUseCase_Factory(getUserPrefRepositoryProvider);
  }

  public static GetUserPrefMealAndDietTypeUseCase newInstance(
      GetUserPrefRepository getUserPrefRepository) {
    return new GetUserPrefMealAndDietTypeUseCase(getUserPrefRepository);
  }
}
