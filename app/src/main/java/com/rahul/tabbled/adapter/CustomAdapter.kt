package com.rahul.tabbled.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahul.tabbled.R
import kotlinx.android.synthetic.main.cutom_item.view.*

class CustomAdapter(val context: Context): RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.cutom_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.view.custom_text.text = position.toString()
    }
}

class CustomViewHolder(val view : View) : RecyclerView.ViewHolder(view)