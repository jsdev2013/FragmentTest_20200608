package com.jisu.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActvity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}