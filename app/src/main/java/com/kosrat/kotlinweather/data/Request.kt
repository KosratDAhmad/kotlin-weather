package com.kosrat.kotlinweather.data

import android.util.Log
import java.net.URL

/**
 * Created by kosrat on 11/8/17.
 */

class Request(private val url: String) {

    fun run(){
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.name, forecastJsonStr)
    }
}