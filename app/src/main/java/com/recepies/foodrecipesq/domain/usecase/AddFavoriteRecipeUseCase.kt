package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository
import com.recepies.recipecore.domain.model.RecipeDataModel
import javax.inject.Inject

class AddFavoriteRecipeUseCase @Inject constructor(
    private val recipeRepository: FavoriteRecipeRepository
) {
    suspend operator fun invoke(recipeDataModel: RecipeDataModel) =
        recipeRepository.addFavoriteRecipe(recipeDataModel)
}