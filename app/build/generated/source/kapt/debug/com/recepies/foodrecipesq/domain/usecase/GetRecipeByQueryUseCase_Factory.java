// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.domain.usecase;

import com.recepies.foodrecipesq.domain.repository.GetRecipeByQueryRepo;
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
public final class GetRecipeByQueryUseCase_Factory implements Factory<GetRecipeByQueryUseCase> {
  private final Provider<GetRecipeByQueryRepo> recipeByQueryRepoProvider;

  public GetRecipeByQueryUseCase_Factory(Provider<GetRecipeByQueryRepo> recipeByQueryRepoProvider) {
    this.recipeByQueryRepoProvider = recipeByQueryRepoProvider;
  }

  @Override
  public GetRecipeByQueryUseCase get() {
    return newInstance(recipeByQueryRepoProvider.get());
  }

  public static GetRecipeByQueryUseCase_Factory create(
      Provider<GetRecipeByQueryRepo> recipeByQueryRepoProvider) {
    return new GetRecipeByQueryUseCase_Factory(recipeByQueryRepoProvider);
  }

  public static GetRecipeByQueryUseCase newInstance(GetRecipeByQueryRepo recipeByQueryRepo) {
    return new GetRecipeByQueryUseCase(recipeByQueryRepo);
  }
}
