package com.recepies.foodrecipesq.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeFilterViewModel;", "Landroidx/lifecycle/ViewModel;", "getMealDietTypeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetMealDietTypeUseCase;", "saveUserPrefUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/SaveUserPrefUseCase;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetMealDietTypeUseCase;Lcom/recepies/foodrecipesq/domain/usecase/SaveUserPrefUseCase;)V", "_mealDietTypeData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/MealTypeDietTypeDataModel;", "mealDietTypeData", "Landroidx/lifecycle/LiveData;", "getMealDietTypeData", "()Landroidx/lifecycle/LiveData;", "mealTypeDietTypeDataModel", "getMealDietType", "Lkotlinx/coroutines/Job;", "getMealDietTypeDataModel", "saveUserPref", "mealType", "Lcom/recepies/recipecore/domain/model/MealType;", "dietType", "Lcom/recepies/recipecore/domain/model/DietType;", "setMealDietTypeDataModel", "", "app_debug"})
public final class RecipeFilterViewModel extends androidx.lifecycle.ViewModel {
    private final com.recepies.foodrecipesq.domain.usecase.GetMealDietTypeUseCase getMealDietTypeUseCase = null;
    private final com.recepies.foodrecipesq.domain.usecase.SaveUserPrefUseCase saveUserPrefUseCase = null;
    private com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel mealTypeDietTypeDataModel;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel>> _mealDietTypeData = null;
    
    @javax.inject.Inject
    public RecipeFilterViewModel(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetMealDietTypeUseCase getMealDietTypeUseCase, @org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.SaveUserPrefUseCase saveUserPrefUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel>> getMealDietTypeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getMealDietType() {
        return null;
    }
    
    public final void setMealDietTypeDataModel(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel mealTypeDietTypeDataModel) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel getMealDietTypeDataModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveUserPref(@org.jetbrains.annotations.Nullable
    com.recepies.recipecore.domain.model.MealType mealType, @org.jetbrains.annotations.Nullable
    com.recepies.recipecore.domain.model.DietType dietType) {
        return null;
    }
}