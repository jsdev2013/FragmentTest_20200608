package com.jisu.fragmenttest_20200608.fragments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jisu.fragmenttest_20200608.BaseFragment
import com.jisu.fragmenttest_20200608.MainActivity
import com.jisu.fragmenttest_20200608.R
import kotlinx.android.synthetic.main.activity_first_fragment.*

class FirstFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_first_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        Fragment 에서 다른 페이지로 이동할 때 예시(사용은 안함)
//        chgNickNameBtn.setOnClickListener {
//            val myIntent = Intent(mContext, MainActivity::class.java)
//            startActivity(myIntent)
//        }

        telBtn.setOnClickListener {
            val telEdit = telEdt.text.toString()
            val myUri = Uri.parse("tel:${telEdit}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }
    }

    override fun setValues() {
    }
}
