package com.example.uidesigntest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uidesigntest.R
import com.example.uidesigntest.viewholders.ByRoomViewHolder

class ByRoomAdapter : RecyclerView.Adapter<ByRoomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ByRoomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_by_room, parent, false)
        return ByRoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: ByRoomViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}