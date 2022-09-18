package com.example.mycontactapp.domain.repository

import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadLines(country: String, page: Int): Resource<ApiResponse>
    suspend fun saveNews(article: ApiResponse.Article)
    suspend fun deleteNews(article: ApiResponse.Article)
    fun getSavedNews(): Flow<List<ApiResponse.Article>>
}