package com.recepies.foodrecipesq.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/recepies/foodrecipesq/domain/repository/GetUserPrefRepository;", "", "getUserPrefData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/recipecore/domain/model/UserPrefMealAndDietDataModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GetUserPrefRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserPrefData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.recepies.recipecore.domain.model.UserPrefMealAndDietDataModel>> continuation);
}