package com.recepies.foodrecipesq.di.usecase;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0011H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/recepies/foodrecipesq/di/usecase/UseCaseModule;", "", "()V", "provdeFavoriteRecipeRepository", "Lcom/recepies/foodrecipesq/domain/repository/FavoriteRecipeRepository;", "favoriteDataSource", "Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/RecipeFavoriteDataSource;", "provideFavoriteDataSource", "provideGetRecipeByQueryRepo", "Lcom/recepies/foodrecipesq/domain/repository/GetRecipeByQueryRepo;", "dataSource", "Lcom/recepies/foodrecipesq/domain/datasource/remoteDatasource/recipeDataSource/GetRecipeDataSource;", "provideGetRecipeDataSource", "provideGetRecipeRepository", "Lcom/recepies/foodrecipesq/domain/repository/GetRecipeRepository;", "getRecipeDataSource", "provideMealDietTypeDataSource", "Lcom/recepies/foodrecipesq/domain/datasource/localDatasource/MealDietTypeDataSource;", "provideMealDietTypeRepository", "Lcom/recepies/foodrecipesq/domain/repository/GetMealDietTypeRepository;", "mealDietTypeDataSource", "provideSaveUserRepo", "Lcom/recepies/foodrecipesq/domain/repository/SaveUserPrefRepo;", "provideUserPrefRepo", "Lcom/recepies/foodrecipesq/domain/repository/GetUserPrefRepository;", "app_debug"})
@dagger.Module
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.di.usecase.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.repository.GetRecipeRepository provideGetRecipeRepository(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource getRecipeDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource provideGetRecipeDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource provideMealDietTypeDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.repository.GetMealDietTypeRepository provideMealDietTypeRepository(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource mealDietTypeDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.repository.SaveUserPrefRepo provideSaveUserRepo(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource mealDietTypeDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.repository.GetUserPrefRepository provideUserPrefRepo(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource mealDietTypeDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.repository.GetRecipeByQueryRepo provideGetRecipeByQueryRepo(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource dataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource provideFavoriteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository provdeFavoriteRecipeRepository(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource favoriteDataSource) {
        return null;
    }
}