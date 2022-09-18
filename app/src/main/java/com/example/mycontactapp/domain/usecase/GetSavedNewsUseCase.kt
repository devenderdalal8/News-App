package com.example.mycontactapp.domain.usecase

import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedNewsUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<ApiResponse.Article>> {
        return newsRepository.getSavedNews()
    }
}