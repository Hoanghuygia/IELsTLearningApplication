package com.example.ielstlearningapplication.di

import android.content.Context
import com.example.ielstlearningapplication.IEltsApplication
import com.example.ielstlearningapplication.data.manager.LocalUserManagerImp
import com.example.ielstlearningapplication.domain.manager.LocalUserManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocaUserManager(
        @ApplicationContext context: Context
    ): LocalUserManager {
        return LocalUserManagerImp(context)
    }
}