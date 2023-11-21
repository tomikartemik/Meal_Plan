package com.recepies.foodrecipesq.data.datasource.localDataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/recepies/foodrecipesq/data/datasource/localDataSource/ImplRecipeFavoriteDataSource;", "Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/RecipeFavoriteDataSource;", "()V", "addToFavoriteRecipe", "", "recipeDataModel", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "(Lcom/recepies/recipecore/domain/model/RecipeDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavRecipeById", "app_debug"})
public final class ImplRecipeFavoriteDataSource implements com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource {
    
    public ImplRecipeFavoriteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addToFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFavoriteRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.recepies.recipecore.domain.model.RecipeDataModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.recipecore.domain.model.RecipeDataModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object removeFromFavRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}