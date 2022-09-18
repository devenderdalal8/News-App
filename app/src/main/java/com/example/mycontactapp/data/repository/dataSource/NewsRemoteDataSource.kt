package com.example.mycontactapp.data.repository.dataSource

import com.example.mycontactapp.data.model.ApiResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopNewsHeadLines(country: String, page: Int): Response<ApiResponse>
}