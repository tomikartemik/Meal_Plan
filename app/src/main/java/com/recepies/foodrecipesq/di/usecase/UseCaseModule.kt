package com.recepies.foodrecipesq.di.usecase

import com.recepies.foodrecipesq.data.datasource.localDataSource.ImplGetMealDietTypeDataSoource
import com.recepies.foodrecipesq.data.datasource.localDataSource.ImplRecipeFavoriteDataSource
import com.recepies.foodrecipesq.data.datasource.remoteDataSource.ImplGetRecipeDataSource
import com.recepies.foodrecipesq.data.repository.*
import com.recepies.foodrecipesq.domain.datasource.localDatasource.MealDietTypeDataSource
import com.recepies.foodrecipesq.domain.datasource.localDatasource.RecipeFavoriteDataSource
import com.recepies.foodrecipesq.domain.datasource.remoteDatasource.recipeDataSource.GetRecipeDataSource
import com.recepies.foodrecipesq.domain.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetRecipeRepository(getRecipeDataSource: GetRecipeDataSource):GetRecipeRepository{
        return ImplGetRecipeRepository(getRecipeDataSource)
    }

    @Provides
    @Singleton
    fun provideGetRecipeDataSource():GetRecipeDataSource{
        return ImplGetRecipeDataSource()
    }

    @Provides
    @Singleton
    fun provideMealDietTypeDataSource():MealDietTypeDataSource{
        return ImplGetMealDietTypeDataSoource()
    }

    @Provides
    @Singleton
    fun provideMealDietTypeRepository(mealDietTypeDataSource: MealDietTypeDataSource):GetMealDietTypeRepository{
        return ImplGetMealDietTypeRepository(
            mealDietTypeDataSource
        )
    }

    @Provides
    @Singleton
    fun provideSaveUserRepo(mealDietTypeDataSource: MealDietTypeDataSource):SaveUserPrefRepo{
        return ImplSaveUserPref(mealDietTypeDataSource)
    }

    @Provides
    @Singleton
    fun provideUserPrefRepo(mealDietTypeDataSource: MealDietTypeDataSource):GetUserPrefRepository{
        return ImplGetUserPrefRepo(mealDietTypeDataSource)
    }

    @Provides
    @Singleton
    fun provideGetRecipeByQueryRepo(dataSource: GetRecipeDataSource):GetRecipeByQueryRepo{
        return ImplGetRecipeByQueryRepo(dataSource)
    }

    @Provides
    @Singleton
    fun provideFavoriteDataSource():RecipeFavoriteDataSource{
        return ImplRecipeFavoriteDataSource()
    }

    @Provides
    @Singleton
    fun provdeFavoriteRecipeRepository(favoriteDataSource: RecipeFavoriteDataSource):FavoriteRecipeRepository{
        return ImplFavoriteRecipeRepository(favoriteDataSource)
    }
}