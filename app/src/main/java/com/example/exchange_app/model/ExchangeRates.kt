package com.example.exchange_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.annotation.concurrent.Immutable

data class ExchangeRates(
    val EUR: Float,
    val USD: Float,
    val JPY: Float,
    val BGN: Float,
    val CZK: Float,
    val DKK: Float,
    val GBP: Float,
    val HUF: Float,
    val PLN: Float,
    val RON: Float,
    val SEK: Float,
    val CHF: Float,
    val ISK: Float,
    val NOK: Float,
    val HRK: Float,
    val TRY: Float,
    val AUD: Float,
    val BRL: Float,
    val CAD: Float,
    val CNY: Float,
    val HKD: Float,
    val IDR: Float,
    val ILS: Float,
    val INR: Float,
    val KRW: Float,
    val MXN: Float,
    val MYR: Float,
    val NZD: Float,
    val PHP: Float,
    val SGD: Float,
    val THB: Float,
    val ZAR: Float,
    )