package com.recepies.recipecore.domain.model

data class RecipeDetailDataModel(
    val viewType:Int,
    val recipeDomainModel: RecipeDataModel,
    val title:String
)
