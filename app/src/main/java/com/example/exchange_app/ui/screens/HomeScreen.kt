package com.example.exchange_app.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.exchange_app.RateCard
import com.example.exchange_app.model.Currency
import com.example.exchange_app.model.exchangeRatesList
import com.example.exchange_app.ui.main.MainViewModel


@Composable
fun HomeScreen(
    viewModel: MainViewModel,
    selectCurrency: (String) -> Unit,
//    modifier: Modifier = Modifier,
) {
    val currencies: List<Currency> by viewModel.currencyList.collectAsState(initial = listOf())
    val isLoading: Boolean by viewModel.isLoading

    val listState = rememberLazyListState()

    ConstraintLayout {
        val (body, progress) = createRefs()

    Surface(
        modifier = Modifier.constrainAs(body){
//            .fillMaxWidth()
//            .padding(4.dp),
    },

        color = MaterialTheme.colors.background,
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Exchange rates: ",
                        style = MaterialTheme.typography.h3
                    )
                }
            }

            items(currencies) { currency ->
                RateCard(currency.base, currency.date, currency.exchangeRates)
//                currency.base.print()
            }
            items(exchangeRatesList) { rate ->
                RateCard(rate.base, rate.target, rate.rate)
            }
        }
    }
    }
    }

