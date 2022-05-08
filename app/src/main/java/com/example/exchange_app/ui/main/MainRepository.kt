package com.example.exchange_app.ui.main

import android.util.Log
import androidx.annotation.WorkerThread
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
    private val currencyDao: CurrencyDao

) {
    @WorkerThread
    fun loadCurrencyList(
        onStart: () -> Unit,
        onCompletion: () -> Unit,
        onError: (String) -> Unit = { }
    ) = flow {
        val currencies = currencyDao.getCurrencyList()
        if (currencies.isEmpty()) {
            currencyService.getCurrencyList()
                .suspendOnSuccess {
                    data[1].base.print()
                    currencyDao.insertCurrencyList(data)
                    emit(data)
                }
                .onError {
                    onError(message())
                }
                .onException {
                    onError(message())
                }
        } else {
            emit(value = currencies)
        }
    }.onStart { onStart() }.onCompletion { onCompletion() }.flowOn(context = Dispatchers.IO)

}

fun String.print(tag: String = "asd") = Log.d(tag, this)
