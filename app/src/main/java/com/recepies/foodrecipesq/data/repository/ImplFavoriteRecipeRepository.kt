package com.recepies.foodrecipesq.data.repository

import com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource
import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository
import com.recepies.foodrecipesq.domain.utils.ApiErrorMessage
import com.recepies.network.ResultEvent
import com.recepies.recipecore.domain.model.RecipeDataModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ImplFavoriteRecipeRepository(private val recipeFavoriteDataSource: RecipeFavoriteDataSource) :
    FavoriteRecipeRepository {
    override suspend fun getFavoriteRecipes(): Flow<ResultEvent<List<RecipeDataModel>>> = flow {
        emit(ResultEvent.OnLoading)
        try {
            val favRecipes = recipeFavoriteDataSource.getFavoriteRecipes()
            if(favRecipes.size > 0){
                emit(ResultEvent.OnSuccess(favRecipes))
            }else{
                emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
            }
        } catch (e: Exception) {
            emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
        }
    }

    override suspend fun addFavoriteRecipe(recipeDataModel: RecipeDataModel): Flow<ResultEvent<Boolean>> =
        flow {
            emit(ResultEvent.OnLoading)
            try {
                recipeFavoriteDataSource.addToFavoriteRecipe(recipeDataModel)
                emit(ResultEvent.OnSuccess(true))
            } catch (e: Exception) {
                emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
            }
        }

    override suspend fun getFavoriteRecipeById(id: Int): Flow<ResultEvent<RecipeDataModel?>> =
        flow {
            emit(ResultEvent.OnLoading)
            try {
                val favRecipe = recipeFavoriteDataSource.getRecipeById(id)
                emit(ResultEvent.OnSuccess(favRecipe))
            } catch (e: Exception) {
                emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
            }
        }

    override suspend fun removeFromFavRecipeById(id: Int): Flow<ResultEvent<Boolean>> = flow {
        emit(ResultEvent.OnLoading)
        try {
            recipeFavoriteDataSource.removeFromFavRecipeById(id)
            emit(ResultEvent.OnSuccess(true))
        } catch (e: Exception) {
            emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
        }
    }

}