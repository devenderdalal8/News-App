package com.example.mycontactapp.data.db

import androidx.room.*
import com.example.mycontactapp.data.model.ApiResponse
import com.example.mycontactapp.data.utils.VariableConstants.Companion.TABLE_NAME
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: ApiResponse.Article)

    @Query("SELECT * FROM $TABLE_NAME")
    fun getAllArticles(): Flow<List<ApiResponse.Article>>

    @Delete
    suspend fun deleteArticle(article: ApiResponse.Article)
}