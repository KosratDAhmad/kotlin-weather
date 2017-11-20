package com.kosrat.kotlinweather.ui

import android.app.Application
import com.kosrat.kotlinweather.ui.utils.DelegatesExt

/**
 * Created by kosrat on 11/20/17.
 */

class App: Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}