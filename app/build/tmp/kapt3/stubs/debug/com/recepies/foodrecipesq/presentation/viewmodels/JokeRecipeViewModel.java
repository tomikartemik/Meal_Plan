package com.recepies.foodrecipesq.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/recepies/foodrecipesq/presentation/viewmodels/JokeRecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "recipeJokeUseCase", "Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeJokeUseCase;", "(Lcom/recepies/foodrecipesq/domain/usecase/GetRecipeJokeUseCase;)V", "_recipeJokeData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/recepies/network/ResultEvent;", "Lcom/recepies/recipecore/data/model/RecipeJokeDataModel;", "recipeJokeData", "Landroidx/lifecycle/LiveData;", "getRecipeJokeData", "()Landroidx/lifecycle/LiveData;", "getRandomFoodJodke", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class JokeRecipeViewModel extends androidx.lifecycle.ViewModel {
    private final com.recepies.foodrecipesq.domain.usecase.GetRecipeJokeUseCase recipeJokeUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.data.model.RecipeJokeDataModel>> _recipeJokeData = null;
    
    @javax.inject.Inject
    public JokeRecipeViewModel(@org.jetbrains.annotations.NotNull
    com.recepies.foodrecipesq.domain.usecase.GetRecipeJokeUseCase recipeJokeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.recepies.network.ResultEvent<com.recepies.recipecore.data.model.RecipeJokeDataModel>> getRecipeJokeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getRandomFoodJodke() {
        return null;
    }
}