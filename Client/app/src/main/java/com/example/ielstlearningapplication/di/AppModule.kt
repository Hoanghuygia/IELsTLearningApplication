package com.example.ielstlearningapplication.di

import com.example.ielstlearningapplication.IEltsApplication
import com.example.ielstlearningapplication.data.manager.LocalUserManagerImp
import com.example.ielstlearningapplication.domain.manager.LocalUserManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocaUserManager(
        application: IEltsApplication
    ): LocalUserManager = LocalUserManagerImp(application)
}