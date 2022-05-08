package com.example.exchange_app.model.dto

data class CurrencyDTO(
    val _id: String? = null,
    val base: String,
    val date: String,
    val exchangeRates: String, // Object/ string
)