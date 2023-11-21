package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository
import javax.inject.Inject

class GetFavoriteRecipesByIdUseCase @Inject constructor(
    private val recipeRepository: FavoriteRecipeRepository
) {
    suspend operator fun invoke(id: Int) = recipeRepository.getFavoriteRecipeById(id)
}