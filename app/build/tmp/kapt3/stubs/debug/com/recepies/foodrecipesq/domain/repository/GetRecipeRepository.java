package com.recepies.foodrecipesq.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/recepies/foodrecipesq/domain/repository/GetRecipeRepository;", "", "getRecipe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/RecipeDomainModel;", "params", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase$GetRecipeUseCaseDataParams;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase$GetRecipeUseCaseDataParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeJoke", "Lcom/recepies/recipecore/data/model/RecipeJokeDataModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GetRecipeRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipe(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase.GetRecipeUseCaseDataParams params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDomainModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipeJoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.data.model.RecipeJokeDataModel>>> continuation);
}