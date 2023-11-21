package com.recepies.foodrecipesq.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0003\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u001a\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010 \u001a\u00020\u000eJ\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/RecipeOverviewFragment;", "Landroidx/fragment/app/Fragment;", "()V", "isFavoriteRecipe", "", "recipeDetailViewModel", "Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeDetailViewModel;", "getRecipeDetailViewModel", "()Lcom/recepies/foodrecipesq/presentation/viewmodels/RecipeDetailViewModel;", "recipeDetailViewModel$delegate", "Lkotlin/Lazy;", "recipeOverviewFragmentBinding", "Lcom/recepies/foodrecipesq/databinding/RecipeOverviewFragmentBinding;", "addedToFavoriteRecipe", "", "initUi", "oberveChanges", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailureOfRemoveRecipeFromFav", "onRecipeAddToFavFailed", "msg", "", "onRecipeRemoveFromFav", "onSuccessOfFavRecipe", "data", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "onSuccessOfRecipeAddedToFav", "onViewCreated", "view", "Landroid/view/View;", "removedFromFavoriteRecipe", "setClickListener", "setDescription", "setImage", "setRecipeContent", "setTitle", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class RecipeOverviewFragment extends androidx.fragment.app.Fragment {
    private com.recepies.foodrecipesq.databinding.RecipeOverviewFragmentBinding recipeOverviewFragmentBinding;
    private boolean isFavoriteRecipe = false;
    private final kotlin.Lazy recipeDetailViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.presentation.fragments.RecipeOverviewFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String RECIPE_OVERVIEW_DATA = "recipe_overview_data";
    
    public RecipeOverviewFragment() {
        super();
    }
    
    private final com.recepies.foodrecipesq.presentation.viewmodels.RecipeDetailViewModel getRecipeDetailViewModel() {
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
    
    private final void oberveChanges() {
    }
    
    private final void onRecipeRemoveFromFav() {
    }
    
    private final void onFailureOfRemoveRecipeFromFav() {
    }
    
    private final void onSuccessOfFavRecipe(com.recepies.recipecore.domain.model.RecipeDataModel data) {
    }
    
    public final void addedToFavoriteRecipe() {
    }
    
    public final void removedFromFavoriteRecipe() {
    }
    
    private final void onSuccessOfRecipeAddedToFav(boolean data) {
    }
    
    private final void onRecipeAddToFavFailed(java.lang.String msg) {
    }
    
    private final void initUi() {
    }
    
    private final void isFavoriteRecipe() {
    }
    
    private final void setClickListener() {
    }
    
    private final void setRecipeContent() {
    }
    
    private final void setTitle() {
    }
    
    private final void setDescription() {
    }
    
    private final void setImage() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/RecipeOverviewFragment$Companion;", "", "()V", "RECIPE_OVERVIEW_DATA", "", "getRECIPE_OVERVIEW_DATA", "()Ljava/lang/String;", "getInstance", "Lcom/recepies/foodrecipesq/presentation/fragments/RecipeOverviewFragment;", "bundle", "Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRECIPE_OVERVIEW_DATA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.recepies.foodrecipesq.presentation.fragments.RecipeOverviewFragment getInstance(@org.jetbrains.annotations.NotNull
        android.os.Bundle bundle) {
            return null;
        }
    }
}