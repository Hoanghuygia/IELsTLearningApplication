package com.example.ielstlearningapplication.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import com.example.ielstlearningapplication.data.remote.ChatApi

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
//            .baseUrl("http://10.0.2.2:5000/")
//            .baseUrl("http://192.168.2.56:5000")
            .baseUrl("http://192.168.88.122:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideChatApi(retrofit: Retrofit): ChatApi {
        return retrofit.create(ChatApi::class.java)
    }
}