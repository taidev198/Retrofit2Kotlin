package com.framgia.retrofit2kotlin

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.framgia.retrofit2kotlin.data.API
import com.framgia.retrofit2kotlin.data.APIService
import com.framgia.retrofit2kotlin.data.Post
import com.framgia.retrofit2kotlin.model.Employee
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.logging.Logger

/**
 * Created by superme198 on 05,May,2019
 * in Retrofit2Kotlin.
 *
 */
class CreateData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_activity)
        val api: APIService = API.apiService
       // Log.d("Hello", api.createNewEmployee().request().url().toString())

//        api.createNewEmployee().enqueue(object : Callback<Employee> {
//            override fun onFailure(call: Call<Employee>, t: Throwable) {
//                var gson = Gson()
////                Logger.getLogger(CreateData::class.java.name).warning( gson.toJson(call.request())+ " Hello World")
//                Logger.getLogger(CreateData::class.java.name).warning(call.toString() + " Hello World")
//            }
//
//            override fun onResponse(call: Call<Employee>, response: Response<Employee>) {
//                if (response.isSuccessful) {
//                    Toast.makeText(applicationContext, response.body()!!.employeeAge, Toast.LENGTH_LONG).show()
//                }
//            }
//
//        })

        api.getDataBase().enqueue(object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Toast.makeText(applicationContext, "fail", Toast.LENGTH_LONG).show()
                Logger.getLogger(CreateData::class.java.name).warning(call.toString() + " Hello World")
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful) {

                    Log.e("Hello", response.body().toString())
                }
            }


        })


    }

}
