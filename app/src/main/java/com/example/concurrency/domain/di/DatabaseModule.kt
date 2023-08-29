package com.example.concurrency.domain.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.concurrency.data.local.FavoriteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {



    @Provides
    @Singleton
    fun provideDatabaseInstance(
        @ApplicationContext context:Context
    ): FavoriteDatabase {

        return Room.databaseBuilder(
            context,
            FavoriteDatabase::class.java,
            "fav_database"
        ).build()
    }









}