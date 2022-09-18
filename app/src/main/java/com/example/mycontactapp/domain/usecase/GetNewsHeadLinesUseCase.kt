package com.example.mycontactapp.domain.usecase

import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.utils.Resource
import com.example.mycontactapp.domain.repository.NewsRepository
import javax.inject.Inject

class GetNewsHeadLinesUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, page: Int): Resource<ApiResponse> {
        return newsRepository.getNewsHeadLines(country, page)
    }
}