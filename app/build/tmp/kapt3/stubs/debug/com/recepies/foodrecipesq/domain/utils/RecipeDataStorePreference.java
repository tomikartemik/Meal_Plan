package com.recepies.foodrecipesq.domain.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/recepies/foodrecipesq/domain/utils/RecipeDataStorePreference;", "", "()V", "RECIPE_DATASTORE", "", "recipeDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getRecipeDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "recipeDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getUserPrefDietType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/recepies/recipecore/domain/model/DietType;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPrefMealType", "Lcom/recepies/recipecore/domain/model/MealType;", "saveUserPrefDietyType", "userPrefMealDietType", "(Lcom/recepies/recipecore/domain/model/DietType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserPrefMealType", "(Lcom/recepies/recipecore/domain/model/MealType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RECIPE_DATASTORE_KEY", "app_debug"})
public final class RecipeDataStorePreference {
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.domain.utils.RecipeDataStorePreference INSTANCE = null;
    private static final java.lang.String RECIPE_DATASTORE = "RECIPE_DATASTORE";
    private static final kotlin.properties.ReadOnlyProperty recipeDataStore$delegate = null;
    
    private RecipeDataStorePreference() {
        super();
    }
    
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getRecipeDataStore(android.content.Context $this$recipeDataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserPrefMealType(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.recepies.recipecore.domain.model.MealType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserPrefDietType(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.recepies.recipecore.domain.model.DietType>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveUserPrefMealType(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.MealType userPrefMealDietType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveUserPrefDietyType(@org.jetbrains.annotations.NotNull
    com.recepies.recipecore.domain.model.DietType userPrefMealDietType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/recepies/foodrecipesq/domain/utils/RecipeDataStorePreference$RECIPE_DATASTORE_KEY;", "", "()V", "dietType", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getDietType", "()Landroidx/datastore/preferences/core/Preferences$Key;", "mealType", "getMealType", "app_debug"})
    static final class RECIPE_DATASTORE_KEY {
        @org.jetbrains.annotations.NotNull
        public static final com.recepies.foodrecipesq.domain.utils.RecipeDataStorePreference.RECIPE_DATASTORE_KEY INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> mealType = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> dietType = null;
        
        private RECIPE_DATASTORE_KEY() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getMealType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getDietType() {
            return null;
        }
    }
}