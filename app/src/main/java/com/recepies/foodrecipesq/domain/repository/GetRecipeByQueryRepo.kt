package com.recepies.foodrecipesq.domain.repository

import com.recepies.recipecore.domain.model.RecipeDomainModel
import com.recepies.foodrecipesq.domain.usecase.GetRecipeByQueryUseCase
import com.recepies.network.ResultEvent
import kotlinx.coroutines.flow.Flow

interface GetRecipeByQueryRepo {
    suspend fun getRecipeByQuery(params:GetRecipeByQueryUseCase.GetRecipeByQueryUseCaseDataParams):Flow<ResultEvent<RecipeDomainModel>>
}