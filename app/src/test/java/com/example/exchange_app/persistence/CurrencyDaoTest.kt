package com.example.exchange_app.persistence

import com.example.exchange_app.MockTestUtil.mockCurrencyList
import com.example.exchange_app.model.Currency
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [31])
class CurrencyDaoTest : DatabaseLocal() {
    private lateinit var currencyDao: CurrencyDao

    @Before
    override fun initDB() {
        super.initDB()
        currencyDao = db.currencyDao()
    }

    @Test
    fun insertCurrencyListTest() = runBlocking {
        val mockDataList = mockCurrencyList()
        currencyDao.insertCurrencyList(mockDataList)

        val currencyListInDb = currencyDao.getCurrencyList()
        MatcherAssert.assertThat(currencyListInDb.toString(), `is`(mockDataList.toString()))

        val mockData = Currency.mock()
        MatcherAssert.assertThat(currencyListInDb.first().toString(), `is`(mockData.toString()))
    }

    @Test
    fun getCurrencyListTest() = runBlocking {
        val currencyListInDb = currencyDao.getCurrencyList()
        MatcherAssert.assertThat(currencyListInDb.toString(), `is`(emptyList<Currency>().toString()))
    }

}