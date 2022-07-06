package com.example.uidesigntest.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uidesigntest.adapters.ByRoomAdapter
import kotlinx.android.synthetic.main.viewpod_by_room.view.*

class ByRoomViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    private lateinit var mAdapter : ByRoomAdapter

    override fun onFinishInflate() {
        super.onFinishInflate()

        setUpAdapter()
    }

    private fun setUpAdapter(){
        mAdapter = ByRoomAdapter()
        rvByRoom.adapter = mAdapter
        rvByRoom.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}