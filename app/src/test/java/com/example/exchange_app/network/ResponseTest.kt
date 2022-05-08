package com.example.exchange_app.network

import com.skydoves.sandwich.ApiResponse
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ResponseTest : ApiAbstract() {
    private lateinit var service: CurrencyService

    @Before
    fun init() {
        service = createService()
    }

    @Test
    fun exception() {
        val exception = Exception("foo")
        val apiResponse = ApiResponse.error<String>(exception)
        MatcherAssert.assertThat(apiResponse.message, CoreMatchers.`is`("foo"))
    }
}