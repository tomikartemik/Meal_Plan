package com.recepies.foodrecipesq;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/recepies/foodrecipesq/RecipeApplication;", "Landroid/app/Application;", "()V", "recipeRoomDb", "Lcom/recepies/dbmodule/RecipeRoomDb;", "getRecipeRoomDb", "()Lcom/recepies/dbmodule/RecipeRoomDb;", "setRecipeRoomDb", "(Lcom/recepies/dbmodule/RecipeRoomDb;)V", "retrofitClient", "Lcom/recepies/network/RetrofitClient;", "getRetrofitClient", "()Lcom/recepies/network/RetrofitClient;", "setRetrofitClient", "(Lcom/recepies/network/RetrofitClient;)V", "initReicpeRoomDb", "", "initializeRetrofit", "intializeResource", "onCreate", "Companion", "app_debug"})
@dagger.hilt.android.HiltAndroidApp
public final class RecipeApplication extends android.app.Application {
    @javax.inject.Inject
    public com.recepies.network.RetrofitClient retrofitClient;
    @javax.inject.Inject
    public com.recepies.dbmodule.RecipeRoomDb recipeRoomDb;
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.RecipeApplication.Companion Companion = null;
    private static com.recepies.foodrecipesq.RecipeApplication applicationContext_;
    
    public RecipeApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recepies.network.RetrofitClient getRetrofitClient() {
        return null;
    }
    
    public final void setRetrofitClient(@org.jetbrains.annotations.NotNull
    com.recepies.network.RetrofitClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recepies.dbmodule.RecipeRoomDb getRecipeRoomDb() {
        return null;
    }
    
    public final void setRecipeRoomDb(@org.jetbrains.annotations.NotNull
    com.recepies.dbmodule.RecipeRoomDb p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void initReicpeRoomDb() {
    }
    
    private final void intializeResource() {
    }
    
    private final void initializeRetrofit() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/recepies/foodrecipesq/RecipeApplication$Companion;", "", "()V", "applicationContext_", "Lcom/recepies/foodrecipesq/RecipeApplication;", "getApplicationContext", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.recepies.foodrecipesq.RecipeApplication getApplicationContext() {
            return null;
        }
    }
}