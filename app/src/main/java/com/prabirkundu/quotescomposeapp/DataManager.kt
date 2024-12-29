package com.prabirkundu.quotescomposeapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.prabirkundu.quotescomposeapp.model.Quotes
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

object DataManager {
    var data = emptyArray<Quotes>()
    var isDataLoaded = mutableStateOf( false)
    fun loadAssetsFromFile(context:Context){
        val inputStream = context.assets.open("Quotes.json")
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, StandardCharsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json,Array<Quotes>::class.java)
        isDataLoaded.value = true
    }
}