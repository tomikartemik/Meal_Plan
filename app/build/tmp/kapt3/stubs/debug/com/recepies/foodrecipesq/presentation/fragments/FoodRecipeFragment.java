package com.recepies.foodrecipesq.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\u0014H\u0002J\b\u0010+\u001a\u00020\u0014H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/FoodRecipeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/recepies/foodrecipesq/databinding/FragmentFoodRecipeBinding;", "getBinding", "()Lcom/recepies/foodrecipesq/databinding/FragmentFoodRecipeBinding;", "setBinding", "(Lcom/recepies/foodrecipesq/databinding/FragmentFoodRecipeBinding;)V", "foodRecipeViewModel", "Lcom/recepies/foodrecipesq/presentation/viewmodels/FoodRecipeViewModel;", "getFoodRecipeViewModel", "()Lcom/recepies/foodrecipesq/presentation/viewmodels/FoodRecipeViewModel;", "foodRecipeViewModel$delegate", "Lkotlin/Lazy;", "fragRecipeAdapter", "Lcom/recepies/foodrecipesq/presentation/adapter/RecipeFragAdapter;", "loaderView", "Lcom/recepies/foodrecipesq/presentation/widget/LoaderWidget;", "addLoaderView", "", "getRecipeByQueryUseCaseParams", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeByQueryUseCase$GetRecipeByQueryUseCaseDataParams;", "queryText", "", "goToRecipeFilterFragment", "hideLoader", "hideNoInternetUi", "initUi", "observeChanges", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "data", "Lcom/recepies/recipecore/domain/model/RecipeDataModel;", "onSuccessOfRecipeData", "Lcom/recepies/recipecore/domain/model/RecipeDomainModel;", "onViewCreated", "view", "Landroid/view/View;", "setClickListener", "setOptionsMenu", "setRecipeRecyclerView", "showLoader", "showNoInternetUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FoodRecipeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.recepies.foodrecipesq.databinding.FragmentFoodRecipeBinding binding;
    private com.recepies.foodrecipesq.presentation.adapter.RecipeFragAdapter fragRecipeAdapter;
    private com.recepies.foodrecipesq.presentation.widget.LoaderWidget loaderView;
    private final kotlin.Lazy foodRecipeViewModel$delegate = null;
    
    public FoodRecipeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recepies.foodrecipesq.databinding.FragmentFoodRecipeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.recepies.foodrecipesq.databinding.FragmentFoodRecipeBinding p0) {
    }
    
    private final com.recepies.foodrecipesq.presentation.viewmodels.FoodRecipeViewModel getFoodRecipeViewModel() {
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
    
    private final void setOptionsMenu() {
    }
    
    private final com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase.GetRecipeByQueryUseCaseDataParams getRecipeByQueryUseCaseParams(java.lang.String queryText) {
        return null;
    }
    
    private final void observeChanges() {
    }
    
    private final void showNoInternetUi() {
    }
    
    private final void hideNoInternetUi() {
    }
    
    private final void hideLoader() {
    }
    
    private final void showLoader() {
    }
    
    private final void onSuccessOfRecipeData(com.recepies.recipecore.domain.model.RecipeDomainModel data) {
    }
    
    private final void initUi() {
    }
    
    private final void setClickListener() {
    }
    
    private final void goToRecipeFilterFragment() {
    }
    
    private final void addLoaderView() {
    }
    
    private final void setRecipeRecyclerView() {
    }
    
    private final void onItemClicked(com.recepies.recipecore.domain.model.RecipeDataModel data) {
    }
}