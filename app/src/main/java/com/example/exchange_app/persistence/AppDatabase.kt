package com.example.exchange_app.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.exchange_app.model.Currency

@Database(entities = [Currency::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao
}