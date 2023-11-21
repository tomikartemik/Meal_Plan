package com.recepies.foodrecipesq.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/adapter/RecipeFragAdapter;", "Lcom/recepies/foodrecipesq/domain/utils/CommonAdapter;", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "itemClickCallBack", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemClickCallBack", "()Lkotlin/jvm/functions/Function1;", "bind", "viewbinding", "Landroidx/databinding/ViewDataBinding;", "position", "", "getlayout", "setData", "recipeItemBinding", "Lcom/recepies/foodrecipesq/databinding/RecipeItemBinding;", "data", "app_debug"})
public final class RecipeFragAdapter extends com.recepies.foodrecipesq.domain.utils.CommonAdapter<com.recepies.recipecore.domain.model.RecipeDataModel> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.recepies.recipecore.domain.model.RecipeDataModel, kotlin.Unit> itemClickCallBack = null;
    
    public RecipeFragAdapter(@org.jetbrains.annotations.NotNull
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
    
    private final void setData(com.recepies.foodrecipesq.databinding.RecipeItemBinding recipeItemBinding, com.recepies.recipecore.domain.model.RecipeDataModel data, int position) {
    }
    
    @java.lang.Override
    public int getlayout(int position) {
        return 0;
    }
}