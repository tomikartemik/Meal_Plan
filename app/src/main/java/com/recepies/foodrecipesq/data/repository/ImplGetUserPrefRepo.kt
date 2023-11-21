package com.recepies.foodrecipesq.data.repository

import com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource
import com.recepies.recipecore.domain.model.UserPrefMealAndDietDataModel
import com.recepies.foodrecipesq.domain.repository.GetUserPrefRepository
import kotlinx.coroutines.flow.Flow

class ImplGetUserPrefRepo(
    val localDataSource:MealDietTypeDataSource
):GetUserPrefRepository {
    override suspend fun getUserPrefData(): Flow<UserPrefMealAndDietDataModel>  = localDataSource.getUserPrefMealDiet()
}