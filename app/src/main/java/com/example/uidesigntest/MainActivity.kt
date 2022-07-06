package com.example.uidesigntest

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uidesigntest.adapters.ImageAdapter
import com.example.uidesigntest.viewpods.ByRateViewPod
import com.example.uidesigntest.viewpods.ByRoomViewPod
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter : ImageAdapter
    private lateinit var mByRoomViewPod : ByRoomViewPod
    private lateinit var mByRateViewPod: ByRateViewPod

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTransluentStatusBar()
        setUpAdapter()
        setUpViewPods()
        setUpListeners()
    }

    private fun showTransluentStatusBar(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w : Window = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
    }

    private fun setUpAdapter(){
        mAdapter = ImageAdapter()
        rvImages.adapter = mAdapter
        rvImages.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setUpViewPods(){
        mByRoomViewPod = vpByRoom as ByRoomViewPod
        mByRateViewPod = vpByRate as ByRateViewPod
    }

    @SuppressLint("ResourceAsColor")
    private fun setUpListeners(){
        btnByRate.setOnClickListener {
            btnByRate.setBackgroundResource(R.color.colorAccent)
            vpByRate.visibility = View.VISIBLE

            btnByRoom.setBackgroundResource(R.color.white)
            vpByRoom.visibility = View.GONE
        }

        btnByRoom.setOnClickListener {
            btnByRoom.setBackgroundResource(R.color.colorAccent)
            vpByRoom.visibility = View.VISIBLE

            btnByRate.setBackgroundResource(R.color.white)
            vpByRate.visibility = View.GONE
        }
    }
}