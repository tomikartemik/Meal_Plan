package com.recepies.foodrecipesq.domain.repository

import com.recepies.recipecore.domain.model.RecipeDomainModel
import com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase
import com.recepies.network.ResultEvent
import com.recepies.recipecore.data.model.RecipeJokeDataModel
import kotlinx.coroutines.flow.Flow

interface GetRecipeRepository {
    suspend fun getRecipe(params:GetRecipeUseCase.GetRecipeUseCaseDataParams):Flow<ResultEvent<RecipeDomainModel>>
    suspend fun getRecipeJoke():Flow<ResultEvent<RecipeJokeDataModel>>
}