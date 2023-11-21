// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.presentation.viewmodels;

import com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase;
import com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase;
import com.recepies.foodrecipesq.domain.usecase.GetUserPrefMealAndDietTypeUseCase;
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
public final class FoodRecipeViewModel_Factory implements Factory<FoodRecipeViewModel> {
  private final Provider<GetRecipeUseCase> getRecipeUseCaseProvider;

  private final Provider<GetUserPrefMealAndDietTypeUseCase> getUserPrefMealDietTypeUseCaseProvider;

  private final Provider<GetRecipeByQueryUseCase> getRecipeByQueryUseCaseProvider;

  public FoodRecipeViewModel_Factory(Provider<GetRecipeUseCase> getRecipeUseCaseProvider,
      Provider<GetUserPrefMealAndDietTypeUseCase> getUserPrefMealDietTypeUseCaseProvider,
      Provider<GetRecipeByQueryUseCase> getRecipeByQueryUseCaseProvider) {
    this.getRecipeUseCaseProvider = getRecipeUseCaseProvider;
    this.getUserPrefMealDietTypeUseCaseProvider = getUserPrefMealDietTypeUseCaseProvider;
    this.getRecipeByQueryUseCaseProvider = getRecipeByQueryUseCaseProvider;
  }

  @Override
  public FoodRecipeViewModel get() {
    return newInstance(getRecipeUseCaseProvider.get(), getUserPrefMealDietTypeUseCaseProvider.get(), getRecipeByQueryUseCaseProvider.get());
  }

  public static FoodRecipeViewModel_Factory create(
      Provider<GetRecipeUseCase> getRecipeUseCaseProvider,
      Provider<GetUserPrefMealAndDietTypeUseCase> getUserPrefMealDietTypeUseCaseProvider,
      Provider<GetRecipeByQueryUseCase> getRecipeByQueryUseCaseProvider) {
    return new FoodRecipeViewModel_Factory(getRecipeUseCaseProvider, getUserPrefMealDietTypeUseCaseProvider, getRecipeByQueryUseCaseProvider);
  }

  public static FoodRecipeViewModel newInstance(GetRecipeUseCase getRecipeUseCase,
      GetUserPrefMealAndDietTypeUseCase getUserPrefMealDietTypeUseCase,
      GetRecipeByQueryUseCase getRecipeByQueryUseCase) {
    return new FoodRecipeViewModel(getRecipeUseCase, getUserPrefMealDietTypeUseCase, getRecipeByQueryUseCase);
  }
}
