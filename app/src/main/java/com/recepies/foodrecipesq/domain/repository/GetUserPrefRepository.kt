package com.recepies.foodrecipesq.domain.repository

import com.recepies.recipecore.domain.model.UserPrefMealAndDietDataModel
import kotlinx.coroutines.flow.Flow

interface GetUserPrefRepository {

    suspend fun getUserPrefData(): Flow<UserPrefMealAndDietDataModel>
}