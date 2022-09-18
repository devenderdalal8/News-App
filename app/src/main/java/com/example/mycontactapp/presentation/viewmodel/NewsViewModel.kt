package com.example.mycontactapp.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.*
import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.utils.Resource
import com.example.mycontactapp.data.utils.Utility
import com.example.mycontactapp.domain.usecase.DeleteSavedNewsUseCase
import com.example.mycontactapp.domain.usecase.GetNewsHeadLinesUseCase
import com.example.mycontactapp.domain.usecase.GetSavedNewsUseCase
import com.example.mycontactapp.domain.usecase.SaveNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val getNewsHeadLinesUseCase: GetNewsHeadLinesUseCase,
    private val saveNewsUseCase: SaveNewsUseCase,
    private val getSavedNewsUseCase: GetSavedNewsUseCase,
    private val deleteSavedNewsUseCase: DeleteSavedNewsUseCase
) : ViewModel() {

    private val newsHeadLines = MutableLiveData<Resource<ApiResponse>>()
    val routeNewsHeadLines: LiveData<Resource<ApiResponse>> = newsHeadLines

    fun getNewsHeadlines(country: String, page: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                newsHeadLines.postValue(Resource.Loading())
                if (Utility.isNetworkAvailable(context)) {
                    val apiResult = getNewsHeadLinesUseCase.execute(country, page)
                    newsHeadLines.postValue(apiResult)
                } else {
                    newsHeadLines.postValue(Resource.Error("Internet is not available"))
                }
            } catch (ex: Exception) {
                newsHeadLines.postValue(Resource.Error(ex.message ?: "Error"))
            }
        }
    }

    /**
     *  fun for saving article into room database
     *  @param article article to save
     * */
    fun saveArticle(article: ApiResponse.Article) {
        viewModelScope.launch {
            saveNewsUseCase.execute(article)
        }
    }

    /**
     * fun for getting saved news
     * @return LiveData<List<ApiResponse.Article>>
     * */
    fun getSavedNews(): LiveData<List<ApiResponse.Article>> {
        return liveData {
            getSavedNewsUseCase.execute().collect {
                emit(it)
            }
        }
    }

    /**
     *  fun for deleting article from room database
     *  @param article article to delete
     * */
    fun deleteSavedNews(article: ApiResponse.Article) {
        viewModelScope.launch {
            deleteSavedNewsUseCase.execute(article)
        }
    }
}