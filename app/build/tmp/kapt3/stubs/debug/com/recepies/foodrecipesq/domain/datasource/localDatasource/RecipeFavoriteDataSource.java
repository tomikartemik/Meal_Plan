package com.recepies.foodrecipesq.domain.datasource.localDatasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/RecipeFavoriteDataSource;", "", "addToFavoriteRecipe", "", "recipeDataModel", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "(Lcom/recepies/recipecore/domain/model/RecipeDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavRecipeById", "app_debug"})
public abstract interface RecipeFavoriteDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFavoriteRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.recepies.recipecore.domain.model.RecipeDataModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.recipecore.domain.model.RecipeDataModel> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeFromFavRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}