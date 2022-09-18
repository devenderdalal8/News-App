package com.example.mycontactapp.data.api

import com.example.mycontactapp.BuildConfig
import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("/v2/top-headlines")
    suspend fun getNewsHeadLines(
        @Query("country") country: String,
        @Query("page") page: Int,
        @Query("apiKey") api_key: String = Constants.MY_KEY
    ): Response<ApiResponse>
}