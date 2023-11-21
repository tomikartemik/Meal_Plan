package com.recepies.foodrecipesq.domain.usecase

import com.recepies.recipecore.domain.model.DietType
import com.recepies.recipecore.domain.model.MealType
import com.recepies.foodrecipesq.domain.repository.SaveUserPrefRepo
import javax.inject.Inject

class SaveUserPrefUseCase @Inject constructor(
    private val saveUserPrefRepo: SaveUserPrefRepo
) {

    suspend operator fun invoke(params: SaveUserPrefDataParams) = saveUserPrefRepo.saveUserPre(params)

    data class SaveUserPrefDataParams(
        val mealType: MealType,
        val dietType: DietType
    )
}