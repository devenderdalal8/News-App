package com.example.mycontactapp.presentation.di

import com.example.mycontactapp.data.api.NewsApiService
import com.example.mycontactapp.data.db.ArticleDao
import com.example.mycontactapp.data.repository.dataSource.NewsLocalDataSource
import com.example.mycontactapp.data.repository.dataSource.NewsRemoteDataSource
import com.example.mycontactapp.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import com.example.mycontactapp.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsApiService: NewsApiService): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsApiService)
    }

    @Singleton
    @Provides
    fun provideNewsLocalDataSource(articleDao: ArticleDao): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDao)
    }
}