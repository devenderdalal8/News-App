package com.example.mycontactapp.data.repository.dataSourceImpl

import com.example.mycontactapp.data.db.ArticleDao
import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDao: ArticleDao
) : NewsLocalDataSource {
    override suspend fun saveArticleToDb(article: ApiResponse.Article) {
        articleDao.insert(article)
    }

    override fun getSavedNews(): Flow<List<ApiResponse.Article>> {
        return articleDao.getAllArticles()
    }

    override suspend fun deleteArticleFromDb(article: ApiResponse.Article) {
        articleDao.deleteArticle(article)
    }
}