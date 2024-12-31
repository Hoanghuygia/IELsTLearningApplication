package com.example.ielstlearningapplication.di

import com.example.ielstlearningapplication.data.repository.AIChatRepositoryImp
import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import com.example.ielstlearningapplication.data.remote.ChatApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideAIChatRepository(
        chatApi: ChatApi
    ): AIChatRepository {
        return AIChatRepositoryImp(chatApi)
    }
}