package com.recepies.foodrecipesq.presentation.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/activities/RecipeDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityRecipeDetailBinding", "Lcom/recepies/foodrecipesq/databinding/ActivityRecipeDetailBinding;", "recipeDetailViewModel", "Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeDetailViewModel;", "getRecipeDetailViewModel", "()Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeDetailViewModel;", "recipeDetailViewModel$delegate", "Lkotlin/Lazy;", "recipeDetailViewPagerAdapter", "Lcom/recepies/foodrecipesq/presentation/adapter/RecipeDetailViewPagerAdapter;", "initUi", "", "observeChanges", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSuccessOfRecipeDetailData", "data", "", "Lcom/recepies/recipecore/domain/model/RecipeDetailDataModel;", "readIntent", "setTabWithViewPager", "setViewPager", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class RecipeDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.recepies.foodrecipesq.databinding.ActivityRecipeDetailBinding activityRecipeDetailBinding;
    private com.recepies.foodrecipesq.presentation.adapter.RecipeDetailViewPagerAdapter recipeDetailViewPagerAdapter;
    private final kotlin.Lazy recipeDetailViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.presentation.activities.RecipeDetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RECIPE_DETAIL_DATA = "recipe_detail_data";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATA = "bundle_data";
    
    public RecipeDetailActivity() {
        super();
    }
    
    private final com.recepies.foodrecipesq.presentation.viewmodels.RecipeDetailViewModel getRecipeDetailViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void setTabWithViewPager() {
    }
    
    private final void observeChanges() {
    }
    
    private final void onSuccessOfRecipeDetailData(java.util.List<com.recepies.recipecore.domain.model.RecipeDetailDataModel> data) {
    }
    
    private final void setViewPager() {
    }
    
    @kotlin.Suppress(names = {})
    private final void readIntent() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/activities/RecipeDetailActivity$Companion;", "", "()V", "DATA", "", "RECIPE_DETAIL_DATA", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}