package com.example.exchange_app.mapping

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
            exchangeRates = "Exchange",
        )

        val mappedObject = dtoObject.toCurrency()

        Assert.assertEquals("EUR", mappedObject.base)
        Assert.assertEquals("2022-05-06", mappedObject.date)
        Assert.assertEquals("Exchange", mappedObject.exchangeRates)
        Assert.assertEquals("2", mappedObject.id)

    }
    @Test
    fun testDtoToDomainMissingId() {
        val dtoObject = CurrencyDTO(
            base = "EUR",
            date = "2022-05-06",
            exchangeRates = "Exchange",
        )

        val mappedObject = dtoObject.toCurrency()

        Assert.assertEquals("EUR", mappedObject.base)
        Assert.assertEquals("2022-05-06", mappedObject.date)
        Assert.assertEquals("Exchange", mappedObject.exchangeRates)
        Assert.assertEquals("", mappedObject.id)

    }
}