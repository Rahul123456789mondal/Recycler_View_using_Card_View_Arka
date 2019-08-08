package com.example.recyler_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    //lateinit var adpter : recycle_viewadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val RecyclerView = findViewById<RecyclerView>(R.id.recycleView)
//        RecyclerView.layoutManager = LinearLayoutManager(this)

        Apidata().getData().enqueue(object : Callback<List<userdata>> {
            override fun onFailure(call: Call<List<userdata>>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<userdata>>, response: Response<List<userdata>>) {
                val UserDATA =   response.body()
                UserDATA?.let {
                    showData(it)
                }
            }

        })

    }
        private fun showData(userdata: List<userdata>){
            recycleView.layoutManager = LinearLayoutManager(this)
            recycleView.adapter = recycle_viewadapter(userdata)
    }
}

















