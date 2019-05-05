package com.framgia.retrofit2kotlin

import android.content.pm.PackageManager
import com.framgia.retrofit2kotlin.adapter.EmployeeAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.framgia.retrofit2kotlin.data.API
import com.framgia.retrofit2kotlin.data.Post
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


/**Recyclerview:https://www.androidhive.info/android-databinding-in-recyclerview-profile-screen*/

class MainActivity : AppCompatActivity() {

     lateinit var adapter: EmployeeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = EmployeeAdapter(applicationContext)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter
        var api = API.apiService.getAllEmployee().enqueue(object: Callback,
            retrofit2.Callback<List<ResponseBody>> {
            override fun onFailure(call: Call<List<ResponseBody>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<ResponseBody>>, response: Response<List<ResponseBody>>) {
                if (response.isSuccessful == true) {
                    
                }
            }


        })


    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

        }
    }
}
