package com.example.exchange_app.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.util.*
import javax.annotation.concurrent.Immutable

@Entity(tableName = "currency")
@Immutable
data class Currency(
    @PrimaryKey val id: String,
    val base: String,
    val date: String,
//    val exchangeRates: ExchangeRates // Object/ string
    @Embedded
    @TypeConverters()
    val rates: ExchangeRates // Object/ string

){
    companion object {
        fun mock() = Currency(
            id = "0",
            base = "EUR",
            date = "2022-05-06",
//            exchangeRates = "{\"EUR\":1,\"USD\":1.057,\"JPY\":137.9,\"BGN\":1.9558,\"CZK\":24.665,\"DKK\":7.44,\"GBP\":0.85625,\"HUF\":381.47,\"PLN\":4.7028,\"RON\":4.949,\"SEK\":10.4686,\"CHF\":1.0419,\"ISK\":138.3,\"NOK\":9.9808,\"HRK\":7.5336,\"TRY\":15.8078,\"AUD\":1.4888,\"BRL\":5.3183,\"CAD\":1.356,\"CNY\":7.0506,\"HKD\":8.2969,\"IDR\":15312.44,\"ILS\":3.5965,\"INR\":81.298,\"KRW\":1343.9,\"MXN\":21.3555,\"MYR\":4.6191,\"NZD\":1.644,\"PHP\":55.467,\"SGD\":1.4642,\"THB\":36.303,\"ZAR\":16.9614}"
            rates = ExchangeRates(USD = 1.2F, EUR =1.2F, CAD = 1.2F, CHF = 1.2F, CNY = 1.2F, CZK = 1.2F, JPY = 1.2F, AUD = 1.2F, ZAR = 1.2F, THB = 1.2F, TRY = 1.2F, PHP = 1.2F, PLN = 1.2F, GBP = 1.2F, BGN = 1.2F, SGD = 1.2F, HKD = 1.2F, HRK = 1.2F , HUF = 1.2F, MXN = 1.2F, MYR = 1.2F, NOK = 1.2F, NZD = 1.2F, IDR = 1.2F, ILS = 1.2F, INR = 1.2F, BRL = 1.2F, DKK = 1.2F, RON = 1.2F, SEK = 1.2F, ISK = 1.2F, KRW = 1.2F)
        )
    }
}
