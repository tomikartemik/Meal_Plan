// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.domain.usecase;

import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository;
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
public final class AddFavoriteRecipeUseCase_Factory implements Factory<AddFavoriteRecipeUseCase> {
  private final Provider<FavoriteRecipeRepository> recipeRepositoryProvider;

  public AddFavoriteRecipeUseCase_Factory(
      Provider<FavoriteRecipeRepository> recipeRepositoryProvider) {
    this.recipeRepositoryProvider = recipeRepositoryProvider;
  }

  @Override
  public AddFavoriteRecipeUseCase get() {
    return newInstance(recipeRepositoryProvider.get());
  }

  public static AddFavoriteRecipeUseCase_Factory create(
      Provider<FavoriteRecipeRepository> recipeRepositoryProvider) {
    return new AddFavoriteRecipeUseCase_Factory(recipeRepositoryProvider);
  }

  public static AddFavoriteRecipeUseCase newInstance(FavoriteRecipeRepository recipeRepository) {
    return new AddFavoriteRecipeUseCase(recipeRepository);
  }
}
