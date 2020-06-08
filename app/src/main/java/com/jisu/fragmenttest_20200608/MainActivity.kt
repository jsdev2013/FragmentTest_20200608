package com.jisu.fragmenttest_20200608

import android.os.Bundle
import com.jisu.fragmenttest_20200608.adapter.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActvity() {

    lateinit var myPagerAdater: MyPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        myPagerAdater = MyPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myPagerAdater
        myViewPager01.adapter = myPagerAdater

    }

    override fun setValues() {

    }
}
