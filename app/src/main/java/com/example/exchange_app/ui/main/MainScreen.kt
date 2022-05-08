package com.example.exchange_app.ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.exchange_app.RateCard
import com.example.exchange_app.model.Currency
import com.example.exchange_app.model.exchangeRatesList
import com.example.exchange_app.ui.screens.HomeScreen
import com.google.accompanist.insets.ProvideWindowInsets
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.Provides

//

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    ProvideWindowInsets {
        NavHost(navController = navController, startDestination = NavScreen.Home.route) {
            composable(NavScreen.Home.route) {
                HomeScreen(
                    viewModel = hiltViewModel(),
                    selectCurrency = {
                        navController.navigate("${NavScreen.Home.route}/$it")
                    }
                )
            }

        }
    }
}

sealed class NavScreen(val route: String) {

    object Home : NavScreen("Home")


}
