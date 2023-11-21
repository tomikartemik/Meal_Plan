package com.recepies.recipecore.domain.utils

import com.recepies.recipecore.BuildConfig


object UrlConstants {

    val BASE_URL = BuildConfig.RECIPE_BASE_URL + "/recipes/complexSearch?apiKey=${BuildConfig.RECIPE_KEY}"
    val GET_RANDOM_RECIPE_JOKE = BuildConfig.RECIPE_BASE_URL + "/food/jokes/random?apiKey=${BuildConfig.RECIPE_KEY}"
}