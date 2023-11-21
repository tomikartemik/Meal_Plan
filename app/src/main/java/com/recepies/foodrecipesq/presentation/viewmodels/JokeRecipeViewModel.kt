package com.recepies.foodrecipesq.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recepies.foodrecipesq.domain.usecase.GetRecipeJokeUseCase
import com.recepies.network.ResultEvent
import com.recepies.recipecore.data.model.RecipeJokeDataModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JokeRecipeViewModel @Inject constructor(
    private val recipeJokeUseCase: GetRecipeJokeUseCase
):ViewModel() {

    private val _recipeJokeData:MutableLiveData<ResultEvent<RecipeJokeDataModel>> = MutableLiveData()
     val recipeJokeData:LiveData<ResultEvent<RecipeJokeDataModel>> get() = _recipeJokeData

    fun getRandomFoodJodke() = viewModelScope.launch {
        recipeJokeUseCase().collectLatest {
            _recipeJokeData.postValue(it)
        }
    }
}