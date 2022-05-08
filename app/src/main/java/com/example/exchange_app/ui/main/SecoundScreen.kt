package com.example.exchange_app.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout

import com.example.exchange_app.model.Currency
import com.google.accompanist.insets.statusBarsPadding

//@Preview
@Composable
fun SecondScreen(
    modifier: Modifier = Modifier,
    currencies: List<Currency>,
) {
    val listState = rememberLazyListState()
    Column(
        modifier = modifier
            .statusBarsPadding()
            .background(MaterialTheme.colors.background)
    ) {
        LazyColumn(
            state = listState,
            contentPadding = PaddingValues(4.dp)
        ) {
            items(
                items = currencies,
                itemContent = { currency ->
                    CurrencyRate(
                        currency = currency
                    )
                }
            )
        }
    }
}


@Composable
private fun CurrencyRate(
    modifier: Modifier = Modifier,
    currency: Currency,
    selectCurrency: (Long) -> Unit = {},

    ) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp),
        color = MaterialTheme.colors.onBackground,
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {

            Text(
                text = currency.base,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h2
            )


        }
    }

