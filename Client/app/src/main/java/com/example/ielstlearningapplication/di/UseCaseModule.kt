package com.example.ielstlearningapplication.di

import com.example.ielstlearningapplication.domain.repository.AIChatRepository
import com.example.ielstlearningapplication.domain.usecase.aichat.AIChatUseCase
import com.example.ielstlearningapplication.domain.usecase.aichat.GetMessage
import com.example.ielstlearningapplication.domain.usecase.aichat.SendMessage
import com.example.ielstlearningapplication.domain.usecase.aichat.SendMessageToGemini
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideGetMessage(repository: AIChatRepository): GetMessage {
        return GetMessage(repository)
    }

    @Provides
    @Singleton
    fun provideSendMessage(repository: AIChatRepository): SendMessage {
        return SendMessage(repository)
    }

    @Provides
    @Singleton
    fun provideSendMessageToGemini(repository: AIChatRepository): SendMessageToGemini{
        return SendMessageToGemini(repository)
    }

    @Provides
    @Singleton
    fun provideAIChatUseCase(getMessage: GetMessage, sendMessage: SendMessage, sendMessageToGemini: SendMessageToGemini): AIChatUseCase {
        return AIChatUseCase(getMessage, sendMessage, sendMessageToGemini)
    }
}