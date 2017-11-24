package com.kosrat.kotlinweather.domain.commands

import com.kosrat.kotlinweather.data.server.ForecastRequest
import com.kosrat.kotlinweather.domain.mappers.ForecastDataMapper
import com.kosrat.kotlinweather.domain.model.ForecastList


class RequestForecastCommand(private val zipCode: Long) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(zipCode, forecastRequest.execute())
    }
}