package com.recepies.recipecore.domain.model

data class MealType(
    val title:String,
    var isSelected:Boolean = false,
    val id:String
)
