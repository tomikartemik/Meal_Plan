package com.recepies.foodrecipesq.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase;", "", "recipeByQueryRepo", "Lcom/recepies/foodrecipesq/domain/repository/GetRecipeByQueryRepo;", "(Lcom/recepies/foodrecipesq/domain/repository/GetRecipeByQueryRepo;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/RecipeDomainModel;", "params", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRecipeByQueryUseCaseDataParams", "app_debug"})
public final class GetRecipeByQueryUseCase {
    private final com.recepies.foodrecipesq.domain.repository.GetRecipeByQueryRepo recipeByQueryRepo = null;
    
    @javax.inject.Inject
    public GetRecipeByQueryUseCase(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.repository.GetRecipeByQueryRepo recipeByQueryRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase.GetRecipeByQueryUseCaseDataParams params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDomainModel>>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;", "", "query", "", "instructionsRequired", "", "fillIngredients", "addRecipeInformation", "(Ljava/lang/String;ZZZ)V", "getAddRecipeInformation", "()Z", "getFillIngredients", "getInstructionsRequired", "getQuery", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class GetRecipeByQueryUseCaseDataParams {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String query = null;
        private final boolean instructionsRequired = false;
        private final boolean fillIngredients = false;
        private final boolean addRecipeInformation = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase.GetRecipeByQueryUseCaseDataParams copy(@org.jetbrains.annotations.NotNull
        java.lang.String query, boolean instructionsRequired, boolean fillIngredients, boolean addRecipeInformation) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public GetRecipeByQueryUseCaseDataParams() {
            super();
        }
        
        public GetRecipeByQueryUseCaseDataParams(@org.jetbrains.annotations.NotNull
        java.lang.String query, boolean instructionsRequired, boolean fillIngredients, boolean addRecipeInformation) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getQuery() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getInstructionsRequired() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getFillIngredients() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getAddRecipeInformation() {
            return false;
        }
    }
}