package com.recepies.foodrecipesq.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/recepies/foodrecipesq/data/repository/ImplGetUserPrefRepo;", "Lcom/recepies/foodrecipesq/domain/repository/GetUserPrefRepository;", "localDataSource", "Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/MealDietTypeDataSource;", "(Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/MealDietTypeDataSource;)V", "getLocalDataSource", "()Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/MealDietTypeDataSource;", "getUserPrefData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/recipecore/domain/model/UserPrefMealAndDietDataModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ImplGetUserPrefRepo implements com.recepies.foodrecipesq.domain.repository.GetUserPrefRepository {
    @org.jetbrains.annotations.NotNull
    private final com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource localDataSource = null;
    
    public ImplGetUserPrefRepo(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource getLocalDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getUserPrefData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.recepies.recipecore.domain.model.UserPrefMealAndDietDataModel>> continuation) {
        return null;
    }
}