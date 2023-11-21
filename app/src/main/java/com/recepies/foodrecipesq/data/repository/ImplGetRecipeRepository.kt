package com.recepies.foodrecipesq.data.repository

import com.recepies.recipecore.data.model.toDomainModel
import com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource
import com.recepies.recipecore.domain.model.RecipeDomainModel
import com.recepies.foodrecipesq.domain.repository.GetRecipeRepository
import com.recepies.foodrecipesq.domain.usecase.GetRecipeUseCase
import com.recepies.foodrecipesq.domain.utils.ApiErrorMessage
import com.recepies.recipecore.domain.utils.UrlConstants
import com.recepies.network.NetworkResponse
import com.recepies.network.ResultEvent
import com.recepies.recipecore.data.model.RecipeJokeDataModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ImplGetRecipeRepository(private val recipeDataSource:GetRecipeDataSource):GetRecipeRepository {
    override suspend fun getRecipe(params: GetRecipeUseCase.GetRecipeUseCaseDataParams): Flow<ResultEvent<RecipeDomainModel>> = flow {
        emit(ResultEvent.OnLoading)
        var url = UrlConstants.BASE_URL
        url = url +"&type=${params.type}&addRecipeInformation=${params.addRecipeInformation}&diet=${params.diet}&instructionsRequired=${params.instructionsRequired}"
        val data = recipeDataSource.getRecipes(url)
        when(data){
            is NetworkResponse.Success -> {
                emit(ResultEvent.OnSuccess(data.body.toDomainModel()))
            }
            else ->{
                  emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
            }
        }
    }

    override suspend fun getRecipeJoke(): Flow<ResultEvent<RecipeJokeDataModel>>  = flow{
        emit(ResultEvent.OnLoading)
        val url = UrlConstants.GET_RANDOM_RECIPE_JOKE
        val data = recipeDataSource.getRecipeJoke(url)
        when(data){
            is NetworkResponse.Success -> {
                if(data.body.text != null && data.body.text!!.length > 0){
                    emit(ResultEvent.OnSuccess(data.body))
                }else{
                    emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
                }
            }
            else ->{
                emit(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
            }
        }
    }
}