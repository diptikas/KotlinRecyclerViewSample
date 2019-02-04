package com.kotlin.poc.yml.kotlinapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

class CustomAdapter(val dataList: ArrayList<DataList>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CustomAdapter.ViewHolder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
       return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(dataList[position])

    }


    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(dataList: DataList) {
            val textView= itemView.findViewById<TextView>(R.id.textView)
            textView.text = dataList.name
        }
    }

}
