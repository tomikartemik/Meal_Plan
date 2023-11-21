package com.recepies.foodrecipesq.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001aR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/viewmodels/FoodRecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "getRecipeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase;", "getUserPrefMealDietTypeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetUserPrefMealAndDietTypeUseCase;", "getRecipeByQueryUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase;Lcom/recepies/foodrecipesq/domain/usecase/GetUserPrefMealAndDietTypeUseCase;Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase;)V", "_recipeData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/RecipeDomainModel;", "recipeData", "Landroidx/lifecycle/LiveData;", "getRecipeData", "()Landroidx/lifecycle/LiveData;", "applyFilter", "Lkotlinx/coroutines/Job;", "mealType", "", "dietType", "getRecipByQuery", "params", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;", "getRecipes", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase$GetRecipeUseCaseDataParams;", "app_debug"})
public final class FoodRecipeViewModel extends androidx.lifecycle.ViewModel {
    private final com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase getRecipeUseCase = null;
    private final com.recepies.foodrecipesq.domain.usecase.GetUserPrefMealAndDietTypeUseCase getUserPrefMealDietTypeUseCase = null;
    private final com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase getRecipeByQueryUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDomainModel>> _recipeData = null;
    
    @javax.inject.Inject
    public FoodRecipeViewModel(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase getRecipeUseCase, @org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetUserPrefMealAndDietTypeUseCase getUserPrefMealDietTypeUseCase, @org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase getRecipeByQueryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDomainModel>> getRecipeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRecipes(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase.GetRecipeUseCaseDataParams params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job applyFilter(@org.jetbrains.annotations.Nullable
    java.lang.String mealType, @org.jetbrains.annotations.Nullable
    java.lang.String dietType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRecipByQuery(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase.GetRecipeByQueryUseCaseDataParams params) {
        return null;
    }
}