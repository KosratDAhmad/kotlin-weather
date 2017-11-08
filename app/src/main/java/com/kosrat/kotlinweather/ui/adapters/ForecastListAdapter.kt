package com.kosrat.kotlinweather.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 *
 * Created by kosrat on 11/7/17.
 */

class ForecastListAdapter(private var item: List<String>) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = ViewHolder(TextView(parent.context))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = item[position]
    }

    override fun getItemCount() = item.size

    class ViewHolder(var text: TextView) : RecyclerView.ViewHolder(text)

}