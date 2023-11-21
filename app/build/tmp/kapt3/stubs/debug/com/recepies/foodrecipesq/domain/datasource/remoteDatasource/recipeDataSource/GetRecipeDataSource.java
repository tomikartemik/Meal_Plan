package com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ?\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/recepies/foodrecipesq/domain/datasource/remoteDatasource/recipeDataSource/GetRecipeDataSource;", "", "getRecipeJoke", "Lcom/recepies/network/NetworkResponse;", "Lcom/recepies/recipecore/data/model/RecipeJokeDataModel;", "Ljava/lang/Error;", "Lkotlin/Error;", "url", "", "header", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "Lcom/recepies/recipecore/data/model/RecipeModelDto;", "app_debug"})
public abstract interface GetRecipeDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipes(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.network.NetworkResponse<com.recepies.recipecore.data.model.RecipeModelDto, ? extends java.lang.Error>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipeJoke(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.network.NetworkResponse<com.recepies.recipecore.data.model.RecipeJokeDataModel, ? extends java.lang.Error>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}