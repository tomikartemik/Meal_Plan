package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository
import javax.inject.Inject

class RemoveFavoriteRecipeUseCase @Inject constructor(
    private val favoriteRecipeRepository: FavoriteRecipeRepository
) {
    suspend operator fun invoke(id:Int) = favoriteRecipeRepository.removeFromFavRecipeById(id)
}