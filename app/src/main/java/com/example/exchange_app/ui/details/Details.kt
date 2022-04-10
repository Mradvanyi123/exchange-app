package com.example.exchange_app.ui.details

import androidx.annotation.WorkerThread
import com.example.exchange_app.persistence.CurrencyDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class Details @Inject constructor(
    private val currencyDao: CurrencyDao
) {
    @WorkerThread
    fun getCurrencyList() = flow {
        val currencyList = currencyDao.getCurrencyList()
        emit(currencyList)
    }.flowOn(Dispatchers.IO)
}
