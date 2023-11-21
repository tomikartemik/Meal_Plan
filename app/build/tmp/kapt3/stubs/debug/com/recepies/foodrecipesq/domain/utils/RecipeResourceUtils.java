package com.recepies.foodrecipesq.domain.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u000bH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/recepies/foodrecipesq/domain/utils/RecipeResourceUtils;", "", "()V", "MEAL_DIET_TYPE_FILE", "", "getMEAL_DIET_TYPE_FILE", "()Ljava/lang/String;", "mealDietTypeDataModel", "Lcom/recepies/recipecore/domain/model/MealTypeDietTypeDataModel;", "getDefaultMealDietTypeList", "loadMealDietListFromJsonFile", "", "app_debug"})
public final class RecipeResourceUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.domain.utils.RecipeResourceUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MEAL_DIET_TYPE_FILE = "meal_diet.json";
    private static com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel mealDietTypeDataModel;
    
    private RecipeResourceUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMEAL_DIET_TYPE_FILE() {
        return null;
    }
    
    private final void loadMealDietListFromJsonFile() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel getDefaultMealDietTypeList() {
        return null;
    }
}