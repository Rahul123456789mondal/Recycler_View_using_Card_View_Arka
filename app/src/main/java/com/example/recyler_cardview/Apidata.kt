package com.example.recyler_cardview

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URl = "https://jsonplaceholder.typicode.com/"

interface Apidata {

    @GET("posts")
    fun getData() : Call<List<userdata>>

    companion object{

        operator fun invoke() : Apidata{
            return Retrofit.Builder()
                .baseUrl(BASE_URl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Apidata::class.java)

        }
    }
}










