package com.recepies.foodrecipesq.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recepies.foodrecipesq.domain.usecase.GetFavoriteRecipesUseCase
import com.recepies.foodrecipesq.domain.usecase.RemoveFavoriteRecipeUseCase
import com.recepies.foodrecipesq.domain.utils.ApiErrorMessage
import com.recepies.network.ResultEvent
import com.recepies.recipecore.domain.model.FavoriteRecipeDataModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteRecipeViewModel @Inject constructor(
    private val getFavoriteRecipeUseCase: GetFavoriteRecipesUseCase,
    private val removeFavoriteRecipeUseCase: RemoveFavoriteRecipeUseCase
):ViewModel() {

    private val _recipeData: MutableLiveData<ResultEvent<List<FavoriteRecipeDataModel>>> = MutableLiveData()
    val recipeData: LiveData<ResultEvent<List<FavoriteRecipeDataModel>>> get() = _recipeData

    fun getRecipes() = viewModelScope.launch {
        getFavoriteRecipeUseCase().collectLatest {
            when(it){
                is ResultEvent.OnFailure -> {
                    _recipeData.postValue(ResultEvent.OnFailure(ApiErrorMessage.UNKNOWN_ERROR))
                }
                ResultEvent.OnLoading -> {
                    _recipeData.postValue(ResultEvent.OnLoading)

                }
                is ResultEvent.OnSuccess -> {
                    val favRecipeList = mutableListOf<FavoriteRecipeDataModel>()
                    it.data.forEach {
                        favRecipeList.add(FavoriteRecipeDataModel(isContextualModeSelected = false , recipeDataModel = it))
                    }
                    _recipeData.postValue(ResultEvent.OnSuccess(favRecipeList))
                }
            }
        }
    }

    fun removeFavRecipeById(id:Int) = viewModelScope.launch {
         removeFavoriteRecipeUseCase(id).collectLatest {

         }
    }
}