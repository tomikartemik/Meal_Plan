package com.recepies.foodrecipesq

import android.app.Application
import com.recepies.dbmodule.RecipeDbHelper
import com.recepies.dbmodule.RecipeRoomDb
import com.recepies.network.NetworkHelper
import com.recepies.network.RetrofitClient
import com.recepies.foodrecipesq.domain.utils.RecipeResourceUtils
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class RecipeApplication:Application() {

    @Inject
    lateinit var retrofitClient: RetrofitClient

    @Inject
    lateinit var recipeRoomDb: RecipeRoomDb

    override fun onCreate() {
        super.onCreate()
        applicationContext_ = this
        initializeRetrofit()
        intializeResource()
        initReicpeRoomDb()
    }

    private fun initReicpeRoomDb() {
        RecipeDbHelper.recipeDb = recipeRoomDb
    }

    private fun intializeResource() {
        RecipeResourceUtils.getDefaultMealDietTypeList()
    }

    private fun initializeRetrofit() {
        NetworkHelper.retrofitClient = retrofitClient
    }

    companion object{
        private lateinit var applicationContext_:RecipeApplication
        fun getApplicationContext() = applicationContext_
    }
}