package io.github.haohaozaici.kotlinlearning

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import io.github.haohaozaici.kotlinlearning.adapter.ForecastText
import io.github.haohaozaici.kotlinlearning.adapter.ForecastTextViewBinder
import kotlinx.android.synthetic.main.activity_main.*
import me.drakeet.multitype.Items
import me.drakeet.multitype.MultiTypeAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val items = Items()
        items.add(ForecastText("Mon 6/23 - Sunny - 31/17"))
        items.add(ForecastText("Tue 6/24 - Foggy - 21/8"))
        items.add(ForecastText("Wed 6/25 - Cloudy - 22/17"))
        items.add(ForecastText("Thurs 6/26 - Rainy - 18/11"))

        val adapter = MultiTypeAdapter()
        adapter.register(ForecastText::class.java, ForecastTextViewBinder())

        forecast_list.adapter = MultiTypeAdapter()
        forecast_list.layoutManager = LinearLayoutManager(this)

        adapter.items = items
        adapter.notifyDataSetChanged()

        val assetManager = this.assets.list("")


        this.toast(message = "111", length = Toast.LENGTH_LONG)
    }

    fun Context.toast(message: String, tag: String = javaClass.simpleName, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$tag] : $message", length).show()
    }


}
