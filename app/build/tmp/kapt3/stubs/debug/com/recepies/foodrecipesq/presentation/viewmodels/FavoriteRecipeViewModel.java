package com.recepies.foodrecipesq.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/viewmodels/FavoriteRecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "getFavoriteRecipeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetFavoriteRecipesUseCase;", "removeFavoriteRecipeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/RemoveFavoriteRecipeUseCase;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetFavoriteRecipesUseCase;Lcom/recepies/foodrecipesq/domain/usecase/RemoveFavoriteRecipeUseCase;)V", "_recipeData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/recepies/network/ResultEvent;", "", "Lcom/recepies/recipecore/domain/model/FavoriteRecipeDataModel;", "recipeData", "Landroidx/lifecycle/LiveData;", "getRecipeData", "()Landroidx/lifecycle/LiveData;", "getRecipes", "Lkotlinx/coroutines/Job;", "removeFavRecipeById", "id", "", "app_debug"})
public final class FavoriteRecipeViewModel extends androidx.lifecycle.ViewModel {
    private final com.recepies.foodrecipesq.domain.usecase.GetFavoriteRecipesUseCase getFavoriteRecipeUseCase = null;
    private final com.recepies.foodrecipesq.domain.usecase.RemoveFavoriteRecipeUseCase removeFavoriteRecipeUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<java.util.List<com.recepies.recipecore.domain.model.FavoriteRecipeDataModel>>> _recipeData = null;
    
    @javax.inject.Inject
    public FavoriteRecipeViewModel(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetFavoriteRecipesUseCase getFavoriteRecipeUseCase, @org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.RemoveFavoriteRecipeUseCase removeFavoriteRecipeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<java.util.List<com.recepies.recipecore.domain.model.FavoriteRecipeDataModel>>> getRecipeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job removeFavRecipeById(int id) {
        return null;
    }
}