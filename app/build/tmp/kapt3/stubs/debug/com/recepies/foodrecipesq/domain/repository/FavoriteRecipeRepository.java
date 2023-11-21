package com.recepies.foodrecipesq.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/recepies/foodrecipesq/domain/repository/FavoriteRecipeRepository;", "", "addFavoriteRecipe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "", "recipeDataModel", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "(Lcom/recepies/recipecore/domain/model/RecipeDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavRecipeById", "app_debug"})
public abstract interface FavoriteRecipeRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFavoriteRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<? extends java.util.List<com.recepies.recipecore.domain.model.RecipeDataModel>>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFavoriteRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDataModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeFromFavRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<java.lang.Boolean>>> continuation);
}