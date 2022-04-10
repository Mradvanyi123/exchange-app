package com.example.exchange_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import javax.annotation.concurrent.Immutable

@Entity(tableName = "currency")
@Immutable
data class Currency(
    @PrimaryKey val id: String,
    val name: String,
    val date: String,
    val exchangeRates: String // Object/ string
){
    companion object {
        fun mock() = Currency(
            id = "0",
            name = "What do you call Dragon with no silver?",
            date = "2022.01.01",
            exchangeRates = "JsonReader()"
        )
    }
}
