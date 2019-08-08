package com.example.recyler_cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycle_viewadapter.view.*


class recycle_viewadapter(val userList: List<userdata>) : RecyclerView.Adapter<recycle_viewadapter.DataHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycle_viewadapter, parent,false)
        return DataHolder(v)
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        holder.itemView.item_title.text = userList[position].title
        holder.itemView.item_image.text = userList[position].body
    }


    override fun getItemCount(): Int {
        return userList.size
    }

    class DataHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
//        var itemImage : TextView
//        var itemTitle : TextView
//
//        init {
//            itemImage = itemView.findViewById(R.id.item_image)
//            itemTitle = itemView.findViewById(R.id.item_title)
//        }

}

