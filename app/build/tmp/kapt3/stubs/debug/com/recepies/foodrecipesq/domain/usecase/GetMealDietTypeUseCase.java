package com.recepies.foodrecipesq.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/recepies/foodrecipesq/domain/usecase/GetMealDietTypeUseCase;", "", "mealDietTypeRepository", "Lcom/recepies/foodrecipesq/domain/repository/GetMealDietTypeRepository;", "(Lcom/recepies/foodrecipesq/domain/repository/GetMealDietTypeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/MealTypeDietTypeDataModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetMealDietTypeUseCase {
    private final com.recepies.foodrecipesq.domain.repository.GetMealDietTypeRepository mealDietTypeRepository = null;
    
    @javax.inject.Inject
    public GetMealDietTypeUseCase(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.repository.GetMealDietTypeRepository mealDietTypeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel>>> continuation) {
        return null;
    }
}