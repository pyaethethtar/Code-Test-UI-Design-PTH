package com.example.uidesigntest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uidesigntest.R
import com.example.uidesigntest.viewholders.ByRateViewHolder

class ByRateAdapter : RecyclerView.Adapter<ByRateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ByRateViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_by_rate, parent, false)
        return ByRateViewHolder(view)
    }

    override fun onBindViewHolder(holder: ByRateViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}