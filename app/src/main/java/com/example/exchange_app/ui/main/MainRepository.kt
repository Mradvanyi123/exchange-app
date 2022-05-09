package com.example.exchange_app.ui.main

import androidx.annotation.WorkerThread
import com.example.exchange_app.model.Currency
import com.example.exchange_app.network.CurrencyService
import com.example.exchange_app.persistence.CurrencyDao
import com.skydoves.sandwich.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val currencyService: CurrencyService,
    private val currencyDao: CurrencyDao,
) {
    @WorkerThread
    fun loadCurrencyList(
        onStart: () -> Unit,
        onCompletion: () -> Unit,
        onError: (String) -> Unit
    ) = flow {
        println("1111111")
        val currencies = currencyDao.getCurrencyList()
        println("22222")
        println(currencies.isEmpty())

        if (currencies.isEmpty()) {
            println("22222")

            currencyService.getCurrencyList()

                .suspendOnError {
                    println("suspendOnError")
                    println(response)
                }
                .suspendOnException {
                    println("suspendOnException")
                    println(exception)
                }
                .suspendOnSuccess() {
                    println("3333")

                    println(data)
                    println(response.body())

                    currencyDao.insertCurrencyList( data)
                    emit(data)
                }
        } else {
            println(currencies)
            emit(value = currencies)
        }
    }.onStart { onStart() }.onCompletion { onCompletion() }.flowOn(context = Dispatchers.IO)

}
