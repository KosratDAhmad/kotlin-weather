package com.kosrat.kotlinweather.data.server

import com.google.gson.Gson
import java.net.URL

/**
 * Created by kosrat on 11/8/17.
 */

class ForecastRequest(private val zipCode: Long) {

    companion object {
        private val APP_ID = "d9d87bb00bc55d6f9fc96ac1c42eb006"
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "${URL}&APPID=${APP_ID}&q="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}