package com.example.exchange_app.model.dto.mapping

import com.example.exchange_app.model.Currency
import com.example.exchange_app.model.dto.CurrencyDTO

fun CurrencyDTO.toCurrency() = Currency(
    id = _id ?: "",
    base = base,
    date = date ,
    exchangeRates = exchangeRates,
)