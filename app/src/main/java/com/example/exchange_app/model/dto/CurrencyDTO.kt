package com.example.exchange_app.model.dto

import com.example.exchange_app.model.ExchangeRates

data class CurrencyDTO(
    val _id: String? = null,
    val base: String,
    val date: String,
    val rates: ExchangeRates, // Object/ string
)