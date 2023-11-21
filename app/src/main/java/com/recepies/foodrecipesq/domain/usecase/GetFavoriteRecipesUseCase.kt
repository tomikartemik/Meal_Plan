package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository
import javax.inject.Inject

class GetFavoriteRecipesUseCase @Inject constructor(
    private val favoriteRecipeRepository: FavoriteRecipeRepository
) {
    suspend operator fun invoke() = favoriteRecipeRepository.getFavoriteRecipes()
}