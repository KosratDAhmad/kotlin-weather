package com.kosrat.kotlinweather.domain.commands

interface Command<out T> {
    fun execute(): T
}