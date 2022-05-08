package com.example.exchange_app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp


@Composable
fun RateCard(base: String, target: String, rate:String) {
    Card(
        modifier = Modifier
            // The space between each card and the other
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Column(Modifier.padding(8.dp)) {
                Text(
                    text = base,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(bottom = 8.dp).fillMaxWidth(),
                    color = MaterialTheme.colors.onSurface,
                )
                Text(
                    text = target +"= "+rate,
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

            }
        }
    }
}

