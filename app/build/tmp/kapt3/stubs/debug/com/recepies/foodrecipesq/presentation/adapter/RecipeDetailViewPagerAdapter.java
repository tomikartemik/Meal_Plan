package com.recepies.foodrecipesq.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/adapter/RecipeDetailViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycleOwner", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "list", "", "Lcom/recepies/recipecore/domain/model/RecipeDetailDataModel;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "getList", "updateList", "", "data", "", "Companion", "app_debug"})
public final class RecipeDetailViewPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private java.util.List<com.recepies.recipecore.domain.model.RecipeDetailDataModel> list;
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.foodrecipesq.presentation.adapter.RecipeDetailViewPagerAdapter.Companion Companion = null;
    public static final int RECIPE_OVERVIEW = 1;
    public static final int RECIPE_INSTRUCTIONS = 2;
    
    public RecipeDetailViewPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle lifecycleOwner) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.List<com.recepies.recipecore.domain.model.RecipeDetailDataModel> data) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.recepies.recipecore.domain.model.RecipeDetailDataModel> getList() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/adapter/RecipeDetailViewPagerAdapter$Companion;", "", "()V", "RECIPE_INSTRUCTIONS", "", "RECIPE_OVERVIEW", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}