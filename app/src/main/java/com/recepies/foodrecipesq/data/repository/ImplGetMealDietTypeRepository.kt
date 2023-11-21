package com.recepies.foodrecipesq.data.repository

import com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource
import com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel
import com.recepies.foodrecipesq.domain.repository.GetMealDietTypeRepository
import com.recepies.network.ResultEvent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ImplGetMealDietTypeRepository(
    private val mealDietTypeDataSource: MealDietTypeDataSource
):GetMealDietTypeRepository{
    override suspend fun getMealDietTypeData(): Flow<ResultEvent<MealTypeDietTypeDataModel>> = mealDietTypeDataSource.getMealDietTypeData().map {
            ResultEvent.OnSuccess(it)
        }
}