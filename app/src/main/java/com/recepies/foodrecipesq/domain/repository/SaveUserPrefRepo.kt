package com.recepies.foodrecipesq.domain.repository

import com.recepies.foodrecipesq.domain.usecase.SaveUserPrefUseCase

interface SaveUserPrefRepo {

    suspend fun saveUserPre(params:SaveUserPrefUseCase.SaveUserPrefDataParams)
}