package com.recepies.foodrecipesq.data.datasource.remoteDataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00042\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ=\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00042\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/recepies/foodrecipesq/data/datasource/remoteDataSource/ImplGetRecipeDataSource;", "Lcom/recepies/foodrecipesq/domain/datasource/remoteDatasource/recipeDataSource/GetRecipeDataSource;", "()V", "getRecipeJoke", "Lcom/recepies/network/NetworkResponse;", "Lcom/recepies/recipecore/data/model/RecipeJokeDataModel;", "Ljava/lang/Error;", "Lkotlin/Error;", "url", "", "header", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "Lcom/recepies/recipecore/data/model/RecipeModelDto;", "app_debug"})
public final class ImplGetRecipeDataSource implements com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource {
    
    public ImplGetRecipeDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRecipes(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.network.NetworkResponse<com.recepies.recipecore.data.model.RecipeModelDto, ? extends java.lang.Error>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRecipeJoke(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.network.NetworkResponse<com.recepies.recipecore.data.model.RecipeJokeDataModel, ? extends java.lang.Error>> continuation) {
        return null;
    }
}