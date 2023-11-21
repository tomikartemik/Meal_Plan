package com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource

import com.recepies.recipecore.data.model.RecipeModelDto
import com.recepies.network.NetworkResponse
import com.recepies.recipecore.data.model.RecipeJokeDataModel

interface GetRecipeDataSource {
    suspend fun getRecipes(url:String,header:Map<String,String> = mutableMapOf()): NetworkResponse<RecipeModelDto, Error>
    suspend fun getRecipeJoke(url:String,header: Map<String, String> = mutableMapOf()) :NetworkResponse<RecipeJokeDataModel,Error>
}