package io.github.haohaozaici.kotlinlearning

import android.content.Context
import android.widget.Toast

/**
 * Created by haohao on 2017/12/7.
 */
class Person() {

    var name = ""
        get() = "name: " + field

    init {

    }

    fun Context.toast(message: String, tag: String = javaClass.simpleName, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$tag] : $message", length).show()
    }
}