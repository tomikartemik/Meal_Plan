package com.recepies.dbmodule;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/recepies/dbmodule/RecipeDao;", "", "deleteFavRecipeById", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipe", "", "Lcom/recepies/dbmodule/RecipeDbModel;", "getRecipes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecipeItem", "recipeDbModel", "(Lcom/recepies/dbmodule/RecipeDbModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dbmodule_debug"})
public abstract interface RecipeDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM recipe_db_model")
    public abstract java.lang.Object getRecipes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.recepies.dbmodule.RecipeDbModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertRecipeItem(@org.jetbrains.annotations.NotNull
    com.recepies.dbmodule.RecipeDbModel recipeDbModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM recipe_db_model WHERE :id = id")
    public abstract java.lang.Object getRecipe(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.recepies.dbmodule.RecipeDbModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM recipe_db_model WHERE :id = id")
    public abstract java.lang.Object deleteFavRecipeById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}