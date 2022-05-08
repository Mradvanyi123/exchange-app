package com.example.exchange_app.ui.elements
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.exchange_app.model.Currency
import com.google.accompanist.insets.statusBarsPadding


@Composable
fun CurrencyList(
    modifier: Modifier,
    currencies: List<Currency>,
    selectCurrency: (String) -> Unit,
) {
    LazyColumn(modifier = modifier.statusBarsPadding()) {
//        items(
////            items = currencies,
////            itemContent = { currency ->
////                CurrencyRow(
////                    modifier = Modifier
////                        .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
////                    currency = currency,
////
////                )
//            ) {
//            requestMore()
//        }
    }
}