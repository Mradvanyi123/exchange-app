package com.example.exchange_app.di

import android.content.Context
import coil.util.CoilUtils
import com.example.exchange_app.network.CurrencyService
import com.example.exchange_app.network.RequestInspector
import com.skydoves.sandwich.coroutines.CoroutinesResponseCallAdapterFactory

import javax.inject.Singleton
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(RequestInspector())
            .cache(CoilUtils.createDefaultCache(context))
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
//        .baseUrl("https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/")
            .baseUrl("https://api.vatcomply.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutinesResponseCallAdapterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun provideNetworkService(retrofit: Retrofit) : CurrencyService {
        return retrofit.create(CurrencyService::class.java)
    }
}
