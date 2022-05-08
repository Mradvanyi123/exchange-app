package com.example.exchange_app.model

data class Rate(
    val id: Int,
    val base: String,
    val target: String,
    val rate: String,
)