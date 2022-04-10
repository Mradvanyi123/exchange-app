package com.example.exchange_app.ui.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.exchange_app.R

@Composable
fun DetailsScreen(pressOnBack: () -> Unit) {
    Icon(
        imageVector = Icons.Filled.ArrowBack,
        tint = Color(R.color.teal_200),
        contentDescription = null,
        modifier = Modifier
            .padding(25.dp)
            .clickable(onClick = pressOnBack)
    )
}