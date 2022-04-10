package com.example.exchange_app.ui.main

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exchange_app.NavScreen
import com.google.accompanist.insets.ProvideWindowInsets


@Composable
fun MainScreen() {
    val navController = rememberNavController()

    ProvideWindowInsets {
        NavHost(navController = navController, startDestination = NavScreen.Home.route) {
            composable(NavScreen.Home.route) {
                    Button(onClick = {

                    }) {
                        Text(text = "View exchange rates")
                    }
            }
        }
    }
}