package com.recepies.foodrecipesq.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/recepies/foodrecipesq/data/repository/ImplGetRecipeByQueryRepo;", "Lcom/recepies/foodrecipesq/domain/repository/GetRecipeByQueryRepo;", "remoteDataSource", "Lcom/recepies/foodrecipesq/domain/datasource/remoteDatasource/recipeDataSource/GetRecipeDataSource;", "(Lcom/recepies/foodrecipesq/domain/datasource/remoteDatasource/recipeDataSource/GetRecipeDataSource;)V", "getRemoteDataSource", "()Lcom/recepies/foodrecipesq/domain/datasource/remoteDatasource/recipeDataSource/GetRecipeDataSource;", "getRecipeByQuery", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/RecipeDomainModel;", "params", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ImplGetRecipeByQueryRepo implements com.recepies.foodrecipesq.domain.repository.GetRecipeByQueryRepo {
    @org.jetbrains.annotations.NotNull
    private final com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource remoteDataSource = null;
    
    public ImplGetRecipeByQueryRepo(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource getRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRecipeByQuery(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase.GetRecipeByQueryUseCaseDataParams params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDomainModel>>> continuation) {
        return null;
    }
}