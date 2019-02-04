package com.kotlin.poc.yml.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView =findViewById<RecyclerView>(R.id.recyclerview);
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val dataList= ArrayList<DataList>();
        dataList.add(DataList("a"))
        dataList.add(DataList("b"))
        dataList.add(DataList("c"))
        dataList.add(DataList("d"))
        dataList.add(DataList("e"))
        dataList.add(DataList("f"))
        dataList.add(DataList("g"))
        dataList.add(DataList("h"))
        dataList.add(DataList("i"))
        dataList.add(DataList("j"))
        dataList.add(DataList("k"))
        dataList.add(DataList("l"))

        val adapter=CustomAdapter(dataList);
        recyclerView.adapter=adapter;


    }
}
