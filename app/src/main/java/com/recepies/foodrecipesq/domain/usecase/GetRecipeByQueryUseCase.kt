package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.GetRecipeByQueryRepo
import javax.inject.Inject

class GetRecipeByQueryUseCase @Inject constructor(
    private val recipeByQueryRepo: GetRecipeByQueryRepo
){
    suspend operator fun invoke(params: GetRecipeByQueryUseCaseDataParams) = recipeByQueryRepo.getRecipeByQuery(params)

    data class GetRecipeByQueryUseCaseDataParams(
        val query :String = "cherry",
        val instructionsRequired:Boolean = true,
        val fillIngredients:Boolean  = true,
        val addRecipeInformation:Boolean = true
    )
}