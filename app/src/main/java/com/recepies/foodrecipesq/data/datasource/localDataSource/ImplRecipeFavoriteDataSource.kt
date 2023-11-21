package com.recepies.foodrecipesq.data.datasource.localDataSource

import com.recepies.dbmodule.RecipeDbHelper
import com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource
import com.recepies.recipecore.domain.model.RecipeDataModel

class ImplRecipeFavoriteDataSource :RecipeFavoriteDataSource{
    override suspend fun addToFavoriteRecipe(recipeDataModel: RecipeDataModel) {
        return RecipeDbHelper.insertRecipeData(recipeDataModel)
    }

    override suspend fun getFavoriteRecipes(): List<RecipeDataModel> {
        return RecipeDbHelper.getAllRecipes()
    }

    override suspend fun getRecipeById(id: Int): RecipeDataModel? {
        return RecipeDbHelper.getRecipeById(id)
    }

    override suspend fun removeFromFavRecipeById(id: Int) {
         RecipeDbHelper.removeFromFavRecipeById(id)
    }
}