package com.example.exchange_app

sealed class NavScreen(val route: String) {
    object Home: NavScreen("Home")
    object Details: NavScreen("Details") {
    }
}