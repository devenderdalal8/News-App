package com.example.mycontactapp.data.repository.dataSourceImpl

import com.example.mycontactapp.data.api.NewsApiService
import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService
): NewsRemoteDataSource {

    override suspend fun getTopNewsHeadLines(country: String, page: Int): Response<ApiResponse> {
        return newsApiService.getNewsHeadLines(country, page)
    }
}