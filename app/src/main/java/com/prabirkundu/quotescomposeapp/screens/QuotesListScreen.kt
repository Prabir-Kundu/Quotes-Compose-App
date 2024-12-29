package com.prabirkundu.quotescomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prabirkundu.quotescomposeapp.R
import com.prabirkundu.quotescomposeapp.model.Quotes

@Composable
fun QuotesListScreen(data: Array<Quotes>, onClick: ()->Unit){
    Column {

        Text(text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp,24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.bodyLarge.copy(
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.W500 // Set text weight to bold
            ),
                fontFamily = FontFamily(Font(R.font.montserrat_regular))
        )
        QuoteList(data = data) {
            onClick()
        }
    }
}