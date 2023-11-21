package com.recepies.foodrecipesq.domain.repository

import com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel
import com.recepies.network.ResultEvent
import kotlinx.coroutines.flow.Flow

interface GetMealDietTypeRepository {

    suspend fun getMealDietTypeData():Flow<ResultEvent<MealTypeDietTypeDataModel>>
}