package com.recepies.foodrecipesq.data.datasource.remoteDataSource

import com.recepies.recipecore.data.model.RecipeModelDto
import com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource
import com.recepies.network.NetworkHelper
import com.recepies.network.NetworkResponse
import com.recepies.recipecore.data.model.RecipeJokeDataModel

class ImplGetRecipeDataSource :GetRecipeDataSource{
    override suspend fun getRecipes(
        url: String,
        header: Map<String, String>
    ): NetworkResponse<RecipeModelDto,Error> = NetworkHelper.makeGetRequest<RecipeModelDto>(url,header)

    override suspend fun getRecipeJoke(
        url: String,
        header: Map<String, String>
    ): NetworkResponse<RecipeJokeDataModel, Error>  = NetworkHelper.makeGetRequest(url,header)

}