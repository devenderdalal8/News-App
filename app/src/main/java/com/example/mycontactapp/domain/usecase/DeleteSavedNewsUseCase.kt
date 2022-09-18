package com.example.mycontactapp.domain.usecase

import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.domain.repository.NewsRepository
import javax.inject.Inject

class DeleteSavedNewsUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    suspend fun execute(article: ApiResponse.Article) {
        newsRepository.deleteNews(article)
    }
}