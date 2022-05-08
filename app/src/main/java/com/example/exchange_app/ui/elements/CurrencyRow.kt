package hu.bme.aut.dadjokes.ui.main.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.exchange_app.ui.elements.CurrencyText
import java.text.DateFormat.getDateTimeInstance
import java.util.*
@Composable
fun CurrencyRow(
    modifier: Modifier = Modifier,
    currency: Currency,
    selectJoke: () -> Unit = { },
) {
    Surface(
        modifier = modifier
            .padding(all = 4.dp)
            .clickable(onClick = selectJoke),
        elevation = 16.dp,
        shape = RoundedCornerShape(size = 24.dp)
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.LightGray)
                .padding(
                    paddingValues = PaddingValues(
                        start = 8.dp,
                        end = 8.dp,
                        top = 4.dp,
                        bottom = 4.dp
                    )
                )
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CurrencyText(base = "asd", target = "asd", rate = "asd")

//            CurrencyText(text = getDateTimeInstance().format(joke.computedDate))

        }
    }
}