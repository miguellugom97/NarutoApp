package com.miguellugo.narutoapp.di

import android.content.Context
import androidx.room.Room
import com.miguellugo.narutoapp.data.local.NarutoDatabase
import com.miguellugo.narutoapp.util.Constants.NARUTO_DATABASE
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
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        NarutoDatabase::class.java,
        NARUTO_DATABASE
    ).build()

}