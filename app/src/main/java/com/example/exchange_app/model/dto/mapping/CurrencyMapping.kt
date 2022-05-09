package com.example.exchange_app.model.dto.mapping

import com.example.exchange_app.model.Currency
import com.example.exchange_app.model.ExchangeRates
import com.example.exchange_app.model.dto.CurrencyDTO

fun CurrencyDTO.toCurrency() = Currency(
    id = _id ?: "",
    base = base,
    date = date ,
    rates = ExchangeRates(USD = 1.2F, EUR =1.2F, CAD = 1.2F, CHF = 1.2F, CNY = 1.2F, CZK = 1.2F, JPY = 1.2F, AUD = 1.2F, ZAR = 1.2F, THB = 1.2F, TRY = 1.2F, PHP = 1.2F, PLN = 1.2F, GBP = 1.2F, BGN = 1.2F, SGD = 1.2F, HKD = 1.2F, HRK = 1.2F , HUF = 1.2F, MXN = 1.2F, MYR = 1.2F, NOK = 1.2F, NZD = 1.2F, IDR = 1.2F, ILS = 1.2F, INR = 1.2F, BRL = 1.2F, DKK = 1.2F, RON = 1.2F, SEK = 1.2F, ISK = 1.2F, KRW = 1.2F)
)