package com.jisu.fragmenttest_20200608

import androidx.fragment.app.Fragment

abstract class BaseFragment :Fragment() {
    abstract fun setupEvents()
    abstract fun setValues()
}