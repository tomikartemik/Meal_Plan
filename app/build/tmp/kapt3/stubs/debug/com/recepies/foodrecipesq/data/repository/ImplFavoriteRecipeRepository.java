package com.recepies.foodrecipesq.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/recepies/foodrecipesq/data/repository/ImplFavoriteRecipeRepository;", "Lcom/recepies/foodrecipesq/domain/repository/FavoriteRecipeRepository;", "recipeFavoriteDataSource", "Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/RecipeFavoriteDataSource;", "(Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/RecipeFavoriteDataSource;)V", "addFavoriteRecipe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "", "recipeDataModel", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "(Lcom/recepies/recipecore/domain/model/RecipeDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavRecipeById", "app_debug"})
public final class ImplFavoriteRecipeRepository implements com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository {
    private final com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource recipeFavoriteDataSource = null;
    
    public ImplFavoriteRecipeRepository(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource recipeFavoriteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFavoriteRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<? extends java.util.List<com.recepies.recipecore.domain.model.RecipeDataModel>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addFavoriteRecipe(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFavoriteRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDataModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object removeFromFavRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<java.lang.Boolean>>> continuation) {
        return null;
    }
}