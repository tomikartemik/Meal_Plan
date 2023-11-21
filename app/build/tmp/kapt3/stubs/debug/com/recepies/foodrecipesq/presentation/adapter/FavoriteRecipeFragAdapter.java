package com.recepies.foodrecipesq.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\b\u0010!\u001a\u00020\u0006H\u0002J \u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/adapter/FavoriteRecipeFragAdapter;", "Lcom/recepies/foodrecipesq/domain/utils/CommonAdapter;", "Lcom/recepies/recipecore/domain/model/FavoriteRecipeDataModel;", "itemClickCallBack", "Lkotlin/Function1;", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "", "(Lkotlin/jvm/functions/Function1;)V", "actionMode", "Landroid/view/ActionMode;", "contextMenuCallback", "Landroid/view/ActionMode$Callback;", "contextMenuClickedCallback", "Lcom/recepies/foodrecipesq/presentation/adapter/FavoriteRecipeFragAdapter$ContextualMenuClickCallback;", "contextualItemCount", "", "isMutliSelect", "", "getItemClickCallBack", "()Lkotlin/jvm/functions/Function1;", "applyContextualSelection", "recipeItemBinding", "Lcom/recepies/foodrecipesq/databinding/RecipeItemBinding;", "position", "bind", "viewbinding", "Landroidx/databinding/ViewDataBinding;", "checkForToremoveContextualMode", "clearContextualMode", "getlayout", "removeAllContextualMode", "removeContextualModeSelection", "setContextualMenuCallback", "setContextualModeTitle", "setData", "favoriteRecipeDataModel", "ContextualMenuClickCallback", "app_debug"})
public final class FavoriteRecipeFragAdapter extends com.recepies.foodrecipesq.domain.utils.CommonAdapter<com.recepies.recipecore.domain.model.FavoriteRecipeDataModel> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.recepies.recipecore.domain.model.RecipeDataModel, kotlin.Unit> itemClickCallBack = null;
    private boolean isMutliSelect = false;
    private int contextualItemCount = 0;
    private android.view.ActionMode actionMode;
    private android.view.ActionMode.Callback contextMenuCallback;
    private com.recepies.foodrecipesq.presentation.adapter.FavoriteRecipeFragAdapter.ContextualMenuClickCallback contextMenuClickedCallback;
    
    public FavoriteRecipeFragAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.recepies.recipecore.domain.model.RecipeDataModel, kotlin.Unit> itemClickCallBack) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.recepies.recipecore.domain.model.RecipeDataModel, kotlin.Unit> getItemClickCallBack() {
        return null;
    }
    
    @java.lang.Override
    public void bind(@org.jetbrains.annotations.NotNull
    androidx.databinding.ViewDataBinding viewbinding, int position) {
    }
    
    private final void setData(com.recepies.foodrecipesq.databinding.RecipeItemBinding recipeItemBinding, com.recepies.recipecore.domain.model.FavoriteRecipeDataModel favoriteRecipeDataModel, int position) {
    }
    
    private final void checkForToremoveContextualMode() {
    }
    
    private final void removeContextualModeSelection(com.recepies.foodrecipesq.databinding.RecipeItemBinding recipeItemBinding) {
    }
    
    private final void applyContextualSelection(com.recepies.foodrecipesq.databinding.RecipeItemBinding recipeItemBinding, int position) {
    }
    
    private final void setContextualModeTitle() {
    }
    
    private final void removeAllContextualMode() {
    }
    
    @java.lang.Override
    public int getlayout(int position) {
        return 0;
    }
    
    public final void setContextualMenuCallback(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.presentation.adapter.FavoriteRecipeFragAdapter.ContextualMenuClickCallback contextMenuClickedCallback) {
    }
    
    public final void clearContextualMode() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/adapter/FavoriteRecipeFragAdapter$ContextualMenuClickCallback;", "", "onDeleteOptionClicked", "", "app_debug"})
    public static abstract interface ContextualMenuClickCallback {
        
        public abstract void onDeleteOptionClicked();
    }
}