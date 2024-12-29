package com.prabirkundu.quotescomposeapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.prabirkundu.quotescomposeapp.model.Quotes

@Composable
fun QuoteList(data: Array<Quotes>, onClick: () -> Unit){
    LazyColumn(content = {
        items(data) {
            QuotesListItem(quote = it){
                onClick()
            }
        }
    })
}