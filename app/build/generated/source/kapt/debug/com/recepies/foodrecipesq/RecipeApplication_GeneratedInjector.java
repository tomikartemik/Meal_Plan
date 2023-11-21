package com.recepies.foodrecipesq;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = RecipeApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface RecipeApplication_GeneratedInjector {
  void injectRecipeApplication(RecipeApplication recipeApplication);
}
