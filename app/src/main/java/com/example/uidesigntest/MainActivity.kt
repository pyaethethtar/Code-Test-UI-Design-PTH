package com.example.uidesigntest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpListeners()
    }

    private fun setUpListeners(){
        btnByRate.setOnClickListener {

        }

        btnByRoom.setOnClickListener {

        }
    }
}