// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.presentation.viewmodels;

import com.recepies.foodrecipesq.domain.usecase.AddFavoriteRecipeUseCase;
import com.recepies.foodrecipesq.domain.usecase.GetFavoriteRecipesByIdUseCase;
import com.recepies.foodrecipesq.domain.usecase.RemoveFavoriteRecipeUseCase;
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
public final class RecipeDetailViewModel_Factory implements Factory<RecipeDetailViewModel> {
  private final Provider<AddFavoriteRecipeUseCase> addFavoriteRecipeUseCaseProvider;

  private final Provider<GetFavoriteRecipesByIdUseCase> getFavoriteRecipesByIdUseCaseProvider;

  private final Provider<RemoveFavoriteRecipeUseCase> removeFavoriteRecipeUseCaseProvider;

  public RecipeDetailViewModel_Factory(
      Provider<AddFavoriteRecipeUseCase> addFavoriteRecipeUseCaseProvider,
      Provider<GetFavoriteRecipesByIdUseCase> getFavoriteRecipesByIdUseCaseProvider,
      Provider<RemoveFavoriteRecipeUseCase> removeFavoriteRecipeUseCaseProvider) {
    this.addFavoriteRecipeUseCaseProvider = addFavoriteRecipeUseCaseProvider;
    this.getFavoriteRecipesByIdUseCaseProvider = getFavoriteRecipesByIdUseCaseProvider;
    this.removeFavoriteRecipeUseCaseProvider = removeFavoriteRecipeUseCaseProvider;
  }

  @Override
  public RecipeDetailViewModel get() {
    return newInstance(addFavoriteRecipeUseCaseProvider.get(), getFavoriteRecipesByIdUseCaseProvider.get(), removeFavoriteRecipeUseCaseProvider.get());
  }

  public static RecipeDetailViewModel_Factory create(
      Provider<AddFavoriteRecipeUseCase> addFavoriteRecipeUseCaseProvider,
      Provider<GetFavoriteRecipesByIdUseCase> getFavoriteRecipesByIdUseCaseProvider,
      Provider<RemoveFavoriteRecipeUseCase> removeFavoriteRecipeUseCaseProvider) {
    return new RecipeDetailViewModel_Factory(addFavoriteRecipeUseCaseProvider, getFavoriteRecipesByIdUseCaseProvider, removeFavoriteRecipeUseCaseProvider);
  }

  public static RecipeDetailViewModel newInstance(AddFavoriteRecipeUseCase addFavoriteRecipeUseCase,
      GetFavoriteRecipesByIdUseCase getFavoriteRecipesByIdUseCase,
      RemoveFavoriteRecipeUseCase removeFavoriteRecipeUseCase) {
    return new RecipeDetailViewModel(addFavoriteRecipeUseCase, getFavoriteRecipesByIdUseCase, removeFavoriteRecipeUseCase);
  }
}
