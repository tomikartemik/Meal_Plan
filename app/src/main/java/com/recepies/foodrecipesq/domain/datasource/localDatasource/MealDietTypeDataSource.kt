package com.recepies.foodrecipesq.domain.datasource.localDatasource

import com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel
import com.recepies.recipecore.domain.model.UserPrefMealAndDietDataModel
import com.recepies.foodrecipesq.domain.usecase.SaveUserPrefUseCase
import kotlinx.coroutines.flow.Flow

interface MealDietTypeDataSource {
    suspend fun getMealDietTypeData():Flow<MealTypeDietTypeDataModel>

    suspend fun saveMealDietType(param:SaveUserPrefUseCase.SaveUserPrefDataParams)

    suspend fun getUserPrefMealDiet():Flow<UserPrefMealAndDietDataModel>

}