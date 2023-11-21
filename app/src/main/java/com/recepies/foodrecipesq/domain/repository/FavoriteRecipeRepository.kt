package com.recepies.foodrecipesq.domain.repository

import com.recepies.network.ResultEvent
import com.recepies.recipecore.domain.model.RecipeDataModel
import kotlinx.coroutines.flow.Flow

interface FavoriteRecipeRepository {
    suspend fun getFavoriteRecipes():Flow<ResultEvent<List<RecipeDataModel>>>
    suspend fun addFavoriteRecipe(recipeDataModel: RecipeDataModel):Flow<ResultEvent<Boolean>>
    suspend fun getFavoriteRecipeById(id:Int):Flow<ResultEvent<RecipeDataModel?>>
    suspend fun removeFromFavRecipeById(id:Int):Flow<ResultEvent<Boolean>>
}