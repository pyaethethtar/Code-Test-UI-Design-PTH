package com.example.uidesigntest.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uidesigntest.adapters.ByRateAdapter
import kotlinx.android.synthetic.main.viewpod_by_rate.view.*

class ByRateViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    private lateinit var mAdapter : ByRateAdapter

    override fun onFinishInflate() {
        super.onFinishInflate()

        setUpAdapter()
    }

    private fun setUpAdapter(){
        mAdapter = ByRateAdapter()
        rvByRate.adapter = mAdapter
        rvByRate.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}