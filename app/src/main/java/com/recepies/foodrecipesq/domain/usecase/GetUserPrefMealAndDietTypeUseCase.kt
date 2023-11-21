package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.GetUserPrefRepository
import javax.inject.Inject

class GetUserPrefMealAndDietTypeUseCase @Inject constructor(
    private val getUserPrefRepository: GetUserPrefRepository
) {
    suspend operator fun invoke() = getUserPrefRepository.getUserPrefData()
}