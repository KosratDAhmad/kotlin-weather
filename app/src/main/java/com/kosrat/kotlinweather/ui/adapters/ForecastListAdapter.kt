package com.kosrat.kotlinweather.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.kosrat.kotlinweather.domain.model.ForecastList

/**
 *
 * Created by kosrat on 11/7/17.
 */

class ForecastListAdapter(private var items: ForecastList) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = ViewHolder(TextView(parent.context))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(items[position]) {
            holder.text.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount() = items.size

    class ViewHolder(var text: TextView) : RecyclerView.ViewHolder(text)
}