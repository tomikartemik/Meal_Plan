package com.recepies.foodrecipesq.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/fragments/JokeRecipeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/recepies/foodrecipesq/databinding/FragmentJokeRecipeBinding;", "jokeRecipeViewModel", "Lcom/recepies/foodrecipesq/presentation/viewmodels/JokeRecipeViewModel;", "getJokeRecipeViewModel", "()Lcom/recepies/foodrecipesq/presentation/viewmodels/JokeRecipeViewModel;", "jokeRecipeViewModel$delegate", "Lkotlin/Lazy;", "loaderView", "Lcom/recepies/foodrecipesq/presentation/widget/LoaderWidget;", "addLoaderView", "", "hideLoader", "hideNoJokeFoundUi", "initUi", "observeChanges", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSuccessOfJokeData", "data", "Lcom/recepies/recipecore/data/model/RecipeJokeDataModel;", "onViewCreated", "view", "Landroid/view/View;", "showLoader", "showNoJokeFoundUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class JokeRecipeFragment extends androidx.fragment.app.Fragment {
    private com.recepies.foodrecipesq.databinding.FragmentJokeRecipeBinding binding;
    private final kotlin.Lazy jokeRecipeViewModel$delegate = null;
    private com.recepies.foodrecipesq.presentation.widget.LoaderWidget loaderView;
    
    public JokeRecipeFragment() {
        super();
    }
    
    private final com.recepies.foodrecipesq.presentation.viewmodels.JokeRecipeViewModel getJokeRecipeViewModel() {
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
    
    private final void addLoaderView() {
    }
    
    private final void observeChanges() {
    }
    
    private final void onSuccessOfJokeData(com.recepies.recipecore.data.model.RecipeJokeDataModel data) {
    }
    
    private final void hideNoJokeFoundUi() {
    }
    
    private final void showNoJokeFoundUi() {
    }
    
    private final void hideLoader() {
    }
    
    private final void showLoader() {
    }
    
    private final void initUi() {
    }
}