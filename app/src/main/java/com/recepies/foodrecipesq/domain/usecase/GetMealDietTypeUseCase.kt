package com.recepies.foodrecipesq.domain.usecase

import com.recepies.foodrecipesq.domain.repository.GetMealDietTypeRepository
import javax.inject.Inject

class GetMealDietTypeUseCase @Inject constructor(private val mealDietTypeRepository: GetMealDietTypeRepository) {
    suspend operator fun invoke() = mealDietTypeRepository.getMealDietTypeData()
}