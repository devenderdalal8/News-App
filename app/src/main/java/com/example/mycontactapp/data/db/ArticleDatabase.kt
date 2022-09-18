package com.example.mycontactapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mycontactapp.data.model.ApiResponse

@Database(
    entities = [ApiResponse.Article::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {
    abstract fun getArticlesDao(): ArticleDao
}