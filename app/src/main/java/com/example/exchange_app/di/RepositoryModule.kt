package com.example.exchange_app.di

import com.example.exchange_app.network.CurrencyService
import com.example.exchange_app.persistence.CurrencyDao
import com.example.exchange_app.ui.main.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideMainRepository(
        currencyService: CurrencyService,
        currencyDao: CurrencyDao
    ) = MainRepository(currencyService, currencyDao)
}