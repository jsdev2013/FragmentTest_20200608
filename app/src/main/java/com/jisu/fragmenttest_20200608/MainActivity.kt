package com.jisu.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisu.fragmenttest_20200608.adapter.myPagerAdapter

class MainActivity : BaseActvity() {

    lateinit var myPagerAdater: myPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}
