package com.recepies.foodrecipesq.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/RecipeFilterBottomSheetFrag;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/recepies/foodrecipesq/databinding/RecipeFilterLayoutBinding;", "currentlySelectedMealDietTypeId", "Lkotlin/Pair;", "", "recipeFilterViewModel", "Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeFilterViewModel;", "getRecipeFilterViewModel", "()Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeFilterViewModel;", "recipeFilterViewModel$delegate", "Lkotlin/Lazy;", "addDietType", "", "data", "Lcom/recepies/recipecore/domain/model/MealTypeDietTypeDataModel;", "addMealtype", "initUi", "observeChanges", "onApplyButtonClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSuccessOfMealDietTypeData", "onViewCreated", "view", "Landroid/view/View;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class RecipeFilterBottomSheetFrag extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.recepies.foodrecipesq.databinding.RecipeFilterLayoutBinding binding;
    private kotlin.Pair<java.lang.String, java.lang.String> currentlySelectedMealDietTypeId;
    private final kotlin.Lazy recipeFilterViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.presentation.fragments.RecipeFilterBottomSheetFrag.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FRAGMENT_SET_RES_KEY = "recipe_filer_key_result";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MEAL_TYPE = "meal_id";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DIET_TYPE = "diet_id";
    
    public RecipeFilterBottomSheetFrag() {
        super();
    }
    
    private final com.recepies.foodrecipesq.presentation.viewmodels.RecipeFilterViewModel getRecipeFilterViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void onApplyButtonClicked() {
    }
    
    private final void observeChanges() {
    }
    
    private final void onSuccessOfMealDietTypeData(com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel data) {
    }
    
    private final void addMealtype(com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel data) {
    }
    
    private final void addDietType(com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel data) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/RecipeFilterBottomSheetFrag$Companion;", "", "()V", "DIET_TYPE", "", "getDIET_TYPE", "()Ljava/lang/String;", "FRAGMENT_SET_RES_KEY", "getFRAGMENT_SET_RES_KEY", "MEAL_TYPE", "getMEAL_TYPE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFRAGMENT_SET_RES_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMEAL_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDIET_TYPE() {
            return null;
        }
    }
}