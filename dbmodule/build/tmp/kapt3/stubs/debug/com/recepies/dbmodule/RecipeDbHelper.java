package com.recepies.dbmodule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/recepies/dbmodule/RecipeDbHelper;", "", "()V", "recipeDb", "Lcom/recepies/dbmodule/RecipeRoomDb;", "getRecipeDb", "()Lcom/recepies/dbmodule/RecipeRoomDb;", "setRecipeDb", "(Lcom/recepies/dbmodule/RecipeRoomDb;)V", "getAllRecipes", "", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecipeData", "", "recipeDataModel", "(Lcom/recepies/recipecore/domain/model/RecipeDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavRecipeById", "dbmodule_debug"})
public final class RecipeDbHelper {
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.dbmodule.RecipeDbHelper INSTANCE = null;
    public static com.recepies.dbmodule.RecipeRoomDb recipeDb;
    
    private RecipeDbHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recepies.dbmodule.RecipeRoomDb getRecipeDb() {
        return null;
    }
    
    public final void setRecipeDb(@org.jetbrains.annotations.NotNull
    com.recepies.dbmodule.RecipeRoomDb p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertRecipeData(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.RecipeDataModel recipeDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.recepies.recipecore.domain.model.RecipeDataModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.recipecore.domain.model.RecipeDataModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object removeFromFavRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}