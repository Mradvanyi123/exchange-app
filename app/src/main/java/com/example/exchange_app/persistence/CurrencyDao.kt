package com.example.exchange_app.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.exchange_app.model.Currency

@Dao
interface CurrencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrencyList(currency: List<Currency>)

    @Query("SELECT * FROM Currency WHERE id = :id_")
    suspend fun getCurrency(id_: String): Currency?

    @Query("SELECT * FROM Currency")
    suspend fun getCurrencyList(): List<Currency>
}