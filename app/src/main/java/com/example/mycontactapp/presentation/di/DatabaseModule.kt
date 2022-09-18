package com.example.mycontactapp.presentation.di

import android.app.Application
import androidx.room.Room
import com.example.mycontactapp.data.db.ArticleDao
import com.example.mycontactapp.data.db.ArticleDatabase
import com.example.mycontactapp.data.utils.VariableConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideArticleDatabase(app: Application): ArticleDatabase {
        return Room.databaseBuilder(app, ArticleDatabase::class.java, VariableConstants.DB_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providesArticlesDao(articleDatabase: ArticleDatabase): ArticleDao {
        return articleDatabase.getArticlesDao()
    }
}