package com.recepies.foodrecipesq.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase;", "", "getRecipeRepository", "Lcom/recepies/foodrecipesq/domain/repository/GetRecipeRepository;", "(Lcom/recepies/foodrecipesq/domain/repository/GetRecipeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/domain/model/RecipeDomainModel;", "params", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase$GetRecipeUseCaseDataParams;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase$GetRecipeUseCaseDataParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRecipeUseCaseDataParams", "app_debug"})
public final class GetRecipeUseCase {
    private final com.recepies.foodrecipesq.domain.repository.GetRecipeRepository getRecipeRepository = null;
    
    @javax.inject.Inject
    public GetRecipeUseCase(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.repository.GetRecipeRepository getRecipeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase.GetRecipeUseCaseDataParams params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.recepies.network.ResultEvent<com.recepies.recipecore.domain.model.RecipeDomainModel>>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeUseCase$GetRecipeUseCaseDataParams;", "", "type", "", "diet", "instructionsRequired", "", "fillIngredients", "addRecipeInformation", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getAddRecipeInformation", "()Z", "getDiet", "()Ljava/lang/String;", "getFillIngredients", "getInstructionsRequired", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class GetRecipeUseCaseDataParams {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String type = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String diet = null;
        private final boolean instructionsRequired = false;
        private final boolean fillIngredients = false;
        private final boolean addRecipeInformation = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase.GetRecipeUseCaseDataParams copy(@org.jetbrains.annotations.NotNull
        java.lang.String type, @org.jetbrains.annotations.NotNull
        java.lang.String diet, boolean instructionsRequired, boolean fillIngredients, boolean addRecipeInformation) {
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
        
        public GetRecipeUseCaseDataParams() {
            super();
        }
        
        public GetRecipeUseCaseDataParams(@org.jetbrains.annotations.NotNull
        java.lang.String type, @org.jetbrains.annotations.NotNull
        java.lang.String diet, boolean instructionsRequired, boolean fillIngredients, boolean addRecipeInformation) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDiet() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getInstructionsRequired() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getFillIngredients() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean getAddRecipeInformation() {
            return false;
        }
    }
}