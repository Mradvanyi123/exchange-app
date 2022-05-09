package com.example.exchange_app.mapping

import com.example.exchange_app.model.ExchangeRates
import com.example.exchange_app.model.dto.CurrencyDTO
import com.example.exchange_app.model.dto.mapping.toCurrency
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.*

@RunWith(JUnit4::class)
class CurrencyDTOMapping {
    @Test
    fun testDtoToDomain() {
        val dtoObject = CurrencyDTO(
            base = "EUR",
            _id="2",
            date = "2022-05-06",
            rates = ExchangeRates(USD = 1.2F, EUR =1.2F, CAD = 1.2F, CHF = 1.2F, CNY = 1.2F, CZK = 1.2F, JPY = 1.2F, AUD = 1.2F, ZAR = 1.2F, THB = 1.2F, TRY = 1.2F, PHP = 1.2F, PLN = 1.2F, GBP = 1.2F, BGN = 1.2F, SGD = 1.2F, HKD = 1.2F, HRK = 1.2F , HUF = 1.2F, MXN = 1.2F, MYR = 1.2F, NOK = 1.2F, NZD = 1.2F, IDR = 1.2F, ILS = 1.2F, INR = 1.2F, BRL = 1.2F, DKK = 1.2F, RON = 1.2F, SEK = 1.2F, ISK = 1.2F, KRW = 1.2F)
            ,
        )

        val mappedObject = dtoObject.toCurrency()

        Assert.assertEquals("EUR", mappedObject.base)
        Assert.assertEquals("2022-05-06", mappedObject.date)
        Assert.assertEquals(
            ExchangeRates(USD = 1.2F, EUR =1.2F, CAD = 1.2F, CHF = 1.2F, CNY = 1.2F, CZK = 1.2F, JPY = 1.2F, AUD = 1.2F, ZAR = 1.2F, THB = 1.2F, TRY = 1.2F, PHP = 1.2F, PLN = 1.2F, GBP = 1.2F, BGN = 1.2F, SGD = 1.2F, HKD = 1.2F, HRK = 1.2F , HUF = 1.2F, MXN = 1.2F, MYR = 1.2F, NOK = 1.2F, NZD = 1.2F, IDR = 1.2F, ILS = 1.2F, INR = 1.2F, BRL = 1.2F, DKK = 1.2F, RON = 1.2F, SEK = 1.2F, ISK = 1.2F, KRW = 1.2F)
            , mappedObject.rates)
        Assert.assertEquals("2", mappedObject.id)

    }
    @Test
    fun testDtoToDomainMissingId() {
        val dtoObject = CurrencyDTO(
            base = "EUR",
            date = "2022-05-06",
            rates = ExchangeRates(USD = 1.2F, EUR =1.2F, CAD = 1.2F, CHF = 1.2F, CNY = 1.2F, CZK = 1.2F, JPY = 1.2F, AUD = 1.2F, ZAR = 1.2F, THB = 1.2F, TRY = 1.2F, PHP = 1.2F, PLN = 1.2F, GBP = 1.2F, BGN = 1.2F, SGD = 1.2F, HKD = 1.2F, HRK = 1.2F , HUF = 1.2F, MXN = 1.2F, MYR = 1.2F, NOK = 1.2F, NZD = 1.2F, IDR = 1.2F, ILS = 1.2F, INR = 1.2F, BRL = 1.2F, DKK = 1.2F, RON = 1.2F, SEK = 1.2F, ISK = 1.2F, KRW = 1.2F),
        )

        val mappedObject = dtoObject.toCurrency()

        Assert.assertEquals("EUR", mappedObject.base)
        Assert.assertEquals("2022-05-06", mappedObject.date)
        Assert.assertEquals(
            ExchangeRates(USD = 1.2F, EUR =1.2F, CAD = 1.2F, CHF = 1.2F, CNY = 1.2F, CZK = 1.2F, JPY = 1.2F, AUD = 1.2F, ZAR = 1.2F, THB = 1.2F, TRY = 1.2F, PHP = 1.2F, PLN = 1.2F, GBP = 1.2F, BGN = 1.2F, SGD = 1.2F, HKD = 1.2F, HRK = 1.2F , HUF = 1.2F, MXN = 1.2F, MYR = 1.2F, NOK = 1.2F, NZD = 1.2F, IDR = 1.2F, ILS = 1.2F, INR = 1.2F, BRL = 1.2F, DKK = 1.2F, RON = 1.2F, SEK = 1.2F, ISK = 1.2F, KRW = 1.2F)
            , mappedObject.rates)
        Assert.assertEquals("", mappedObject.id)

    }

}