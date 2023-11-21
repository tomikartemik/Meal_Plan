package com.recepies.foodrecipesq.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u001a\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006-"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/FavoriteRecipeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/recepies/foodrecipesq/databinding/FragmentFavoriteRecipeBinding;", "getBinding", "()Lcom/recepies/foodrecipesq/databinding/FragmentFavoriteRecipeBinding;", "setBinding", "(Lcom/recepies/foodrecipesq/databinding/FragmentFavoriteRecipeBinding;)V", "fragRecipeAdapter", "Lcom/recepies/foodrecipesq/presentation/adapter/FavoriteRecipeFragAdapter;", "loaderView", "Lcom/recepies/foodrecipesq/presentation/widget/LoaderWidget;", "recipeDetailAcitivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "recipeFavViewModel", "Lcom/recepies/foodrecipesq/presentation/viewmodels/FavoriteRecipeViewModel;", "getRecipeFavViewModel", "()Lcom/recepies/foodrecipesq/presentation/viewmodels/FavoriteRecipeViewModel;", "recipeFavViewModel$delegate", "Lkotlin/Lazy;", "addLoaderView", "", "hideLoader", "hideNoFavRecipeUi", "initUi", "observeChanges", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClicked", "data", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "onSuccessOfRecipeData", "", "Lcom/recepies/recipecore/domain/model/FavoriteRecipeDataModel;", "onViewCreated", "view", "Landroid/view/View;", "setRecipeRecyclerView", "showLoader", "showNoFavRecipeUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FavoriteRecipeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.recepies.foodrecipesq.databinding.FragmentFavoriteRecipeBinding binding;
    private com.recepies.foodrecipesq.presentation.widget.LoaderWidget loaderView;
    private com.recepies.foodrecipesq.presentation.adapter.FavoriteRecipeFragAdapter fragRecipeAdapter;
    private final kotlin.Lazy recipeFavViewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> recipeDetailAcitivityLauncher = null;
    
    public FavoriteRecipeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recepies.foodrecipesq.databinding.FragmentFavoriteRecipeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.recepies.foodrecipesq.databinding.FragmentFavoriteRecipeBinding p0) {
    }
    
    private final com.recepies.foodrecipesq.presentation.viewmodels.FavoriteRecipeViewModel getRecipeFavViewModel() {
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
    
    private final void showNoFavRecipeUi() {
    }
    
    private final void hideNoFavRecipeUi() {
    }
    
    private final void observeChanges() {
    }
    
    private final void onSuccessOfRecipeData(java.util.List<com.recepies.recipecore.domain.model.FavoriteRecipeDataModel> data) {
    }
    
    private final void hideLoader() {
    }
    
    private final void showLoader() {
    }
    
    private final void setRecipeRecyclerView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    private final void onItemClicked(com.recepies.recipecore.domain.model.RecipeDataModel data) {
    }
    
    private final void addLoaderView() {
    }
}