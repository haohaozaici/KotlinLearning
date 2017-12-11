package io.github.haohaozaici.kotlinlearning.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.haohaozaici.kotlinlearning.R
import kotlinx.android.synthetic.main.item_forecast_text.view.*
import me.drakeet.multitype.ItemViewBinder

/**
 * Created by haohao on 2017/12/7.
 */
class ForecastTextViewBinder : ItemViewBinder<ForecastText, ForecastTextViewBinder.ViewHolder>() {

    override fun onCreateViewHolder(inflater: LayoutInflater,
                                    parent: ViewGroup): ViewHolder {
        val root = inflater.inflate(R.layout.item_forecast_text, parent, false)
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: ViewHolder, forecastText: ForecastText) {
        holder.itemView.weather_message.text = forecastText.weather

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}