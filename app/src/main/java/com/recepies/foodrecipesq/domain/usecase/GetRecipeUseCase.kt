package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.GetRecipeRepository
import javax.inject.Inject

class GetRecipeUseCase @Inject constructor(
    private val getRecipeRepository: GetRecipeRepository
) {

    suspend operator  fun invoke(params:GetRecipeUseCaseDataParams) = getRecipeRepository.getRecipe(params)

    data class GetRecipeUseCaseDataParams(
         val type :String = "Main course",
         val diet:String = "Vegetarian",
         val instructionsRequired:Boolean = true,
         val fillIngredients:Boolean  = true,
         val addRecipeInformation:Boolean = true
    )
}