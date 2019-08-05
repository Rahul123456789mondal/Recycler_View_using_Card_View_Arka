package com.example.recyler_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var adpter : recycle_viewadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val titles = arrayOf("Image 1","Image 2","Image 3","Image 4","Image 5","Image 6","Image 7")

         val images = arrayOf(R.drawable.android_1,
            R.drawable.android_2, R.drawable.android_3,
            R.drawable.android_4, R.drawable.android_5,
            R.drawable.android_6, R.drawable.android_7)

        val RecyclerView = findViewById<RecyclerView>(R.id.recycleView)
        RecyclerView.layoutManager = LinearLayoutManager(this)

        adpter = recycle_viewadapter(titles, images)
        RecyclerView.adapter = adpter

    }
}

















