package com.example.exchange_app.network

import com.example.exchange_app.model.Currency
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET

interface CurrencyService {
    @GET("huf.json")
    suspend fun getJokeList(): ApiResponse<List<Currency>>
}