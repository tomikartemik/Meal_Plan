package com.recepies.foodrecipesq.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recepies.recipecore.domain.model.DietType
import com.recepies.recipecore.domain.model.MealType
import com.recepies.recipecore.domain.model.MealTypeDietTypeDataModel
import com.recepies.foodrecipesq.domain.usecase.GetMealDietTypeUseCase
import com.recepies.foodrecipesq.domain.usecase.SaveUserPrefUseCase
import com.recepies.network.ResultEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeFilterViewModel @Inject constructor(
    private val getMealDietTypeUseCase: GetMealDietTypeUseCase,
    private val saveUserPrefUseCase: SaveUserPrefUseCase
):ViewModel() {
    private var mealTypeDietTypeDataModel:MealTypeDietTypeDataModel? = null
    private val _mealDietTypeData:MutableLiveData<ResultEvent<MealTypeDietTypeDataModel>> = MutableLiveData()
    val mealDietTypeData:LiveData<ResultEvent<MealTypeDietTypeDataModel>> get() = _mealDietTypeData

    fun getMealDietType() = viewModelScope.launch {
        getMealDietTypeUseCase().collectLatest {
            _mealDietTypeData.postValue(it)
        }
    }

    fun setMealDietTypeDataModel(mealTypeDietTypeDataModel: MealTypeDietTypeDataModel){
        this.mealTypeDietTypeDataModel = mealTypeDietTypeDataModel
    }
    fun getMealDietTypeDataModel() = mealTypeDietTypeDataModel
    fun saveUserPref(mealType: MealType?, dietType: DietType?) = viewModelScope.launch(Dispatchers.IO + Job()){
        if(mealType != null && dietType != null){
            val params = SaveUserPrefUseCase.SaveUserPrefDataParams(mealType = mealType,dietType = dietType)
            saveUserPrefUseCase(params)
        }
    }
}