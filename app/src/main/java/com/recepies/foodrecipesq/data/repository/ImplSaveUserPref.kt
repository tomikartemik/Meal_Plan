package com.recepies.foodrecipesq.data.repository

import com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource
import com.recepies.foodrecipesq.domain.repository.SaveUserPrefRepo
import com.recepies.foodrecipesq.domain.usecase.SaveUserPrefUseCase

class ImplSaveUserPref(
    private val mealDietTypeDataSoource: MealDietTypeDataSource
):SaveUserPrefRepo {
    override suspend fun saveUserPre(params: SaveUserPrefUseCase.SaveUserPrefDataParams) {
        mealDietTypeDataSoource.saveMealDietType(params)
    }
}