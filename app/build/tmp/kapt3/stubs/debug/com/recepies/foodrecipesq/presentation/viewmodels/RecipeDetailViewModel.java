package com.recepies.foodrecipesq.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u001c\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\fR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "addFavoriteRecipeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/AddFavoriteRecipeUseCase;", "getFavoriteRecipesByIdUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetFavoriteRecipesByIdUseCase;", "removeFavoriteRecipeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/RemoveFavoriteRecipeUseCase;", "(Lcom/recepies/foodrecipesq/domain/usecase/AddFavoriteRecipeUseCase;Lcom/recepies/foodrecipesq/domain/usecase/GetFavoriteRecipesByIdUseCase;Lcom/recepies/foodrecipesq/domain/usecase/RemoveFavoriteRecipeUseCase;)V", "_favoriteRecipe", "Landroidx/lifecycle/MutableLiveData;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "_favoriteRecipeRemoved", "", "_isRecipAdded", "_recipeDetailViewPagerData", "", "Lcom/recepies/recipecore/domain/model/RecipeDetailDataModel;", "favoriteRecipe", "Landroidx/lifecycle/LiveData;", "getFavoriteRecipe", "()Landroidx/lifecycle/LiveData;", "favoriteRecipeRemoved", "getFavoriteRecipeRemoved", "isRecipAdded", "recipeDataModel", "recipeDetailViewPagerData", "getRecipeDetailViewPagerData", "addToFavoriteRecipe", "Lkotlinx/coroutines/Job;", "getFavoriteRecipeById", "id", "", "getRecipeDataModel", "recipeDomainModel", "removeFavoriteRecipeById", "setRecipeDataModel", "", "app_debug"})
public final class RecipeDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.recepies.foodrecipesq.domain.usecase.AddFavoriteRecipeUseCase addFavoriteRecipeUseCase = null;
    private final com.recepies.foodrecipesq.domain.usecase.GetFavoriteRecipesByIdUseCase getFavoriteRecipesByIdUseCase = null;
    private final com.recepies.foodrecipesq.domain.usecase.RemoveFavoriteRecipeUseCase removeFavoriteRecipeUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<java.util.List<com.recepies.recipecore.domain.model.RecipeDetailDataModel>>> _recipeDetailViewPagerData = null;
    private com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDataModel>> _favoriteRecipe = null;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<java.lang.Boolean>> _favoriteRecipeRemoved = null;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<java.lang.Boolean>> _isRecipAdded = null;
    
    @javax.inject.Inject
    public RecipeDetailViewModel(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.AddFavoriteRecipeUseCase addFavoriteRecipeUseCase, @org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetFavoriteRecipesByIdUseCase getFavoriteRecipesByIdUseCase, @org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.RemoveFavoriteRecipeUseCase removeFavoriteRecipeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<java.util.List<com.recepies.recipecore.domain.model.RecipeDetailDataModel>>> getRecipeDetailViewPagerData() {
        return null;
    }
    
    public final void setRecipeDataModel(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recepies.recipecore.domain.model.RecipeDataModel getRecipeDataModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRecipeDetailViewPagerData(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDataModel>> getFavoriteRecipe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getFavoriteRecipeById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<java.lang.Boolean>> getFavoriteRecipeRemoved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job removeFavoriteRecipeById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<java.lang.Boolean>> isRecipAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addToFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel) {
        return null;
    }
}