package com.kosrat.kotlinweather.extensions

/**
 * Created by kosrat on 11/24/17.
 */

fun <K, V : Any> Map<K, V?>.toVarargArray(): Array<out Pair<K, V>> =
        map({ Pair(it.key, it.value!!) }).toTypedArray()