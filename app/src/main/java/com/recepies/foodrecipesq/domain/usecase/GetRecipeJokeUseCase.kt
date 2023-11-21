package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.GetRecipeRepository
import javax.inject.Inject

class GetRecipeJokeUseCase @Inject constructor(private val recipeRepository: GetRecipeRepository) {
    suspend operator fun invoke()  = recipeRepository.getRecipeJoke()
}