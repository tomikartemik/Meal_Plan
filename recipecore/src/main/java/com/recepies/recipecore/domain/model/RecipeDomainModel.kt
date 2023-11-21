package com.recepies.recipecore.domain.model

class RecipeDomainModel(
    val recipes:List<RecipeDataModel>,
    val totalCount:Int,
    val pageNo:Int,
    val pageSize:Int
) {


}