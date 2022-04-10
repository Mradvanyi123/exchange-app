package com.example.exchange_app.ui.main

import com.example.exchange_app.network.CurrencyService
import com.example.exchange_app.persistence.CurrencyDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val currencyService: CurrencyService,
    private val currencyDao: CurrencyDao
)