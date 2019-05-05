package com.framgia.retrofit2kotlin

import retrofit2.Callback

import android.content.pm.PackageManager
import com.framgia.retrofit2kotlin.adapter.EmployeeAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.framgia.retrofit2kotlin.data.API
import com.framgia.retrofit2kotlin.model.Employee
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import java.util.logging.Logger


/**Recyclerview:https://www.androidhive.info/android-databinding-in-recyclerview-profile-screen*/

class MainActivity : AppCompatActivity() {

    lateinit var adapter: EmployeeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = EmployeeAdapter(applicationContext)
        recycler_view.layoutManager = LinearLayoutManager(this)
        var emp = arrayListOf(Employee("tai"), Employee("tai"), Employee("tai"))
        var api = API.apiService.getAllEmployee().enqueue(object : Callback<List<Employee>> {
            override fun onFailure(call: Call<List<Employee>>, t: Throwable) {


            }

            override fun onResponse(call: Call<List<Employee>>, response: Response<List<Employee>>) {
                if (response.isSuccessful) {
                    adapter.setNotes(response.body())
                    Logger.getLogger(MainActivity::class.java.name).warning("size of Employee")

                }

            }

        })
        recycler_view.setHasFixedSize(true)
       // adapter.setNotes(emp)
        recycler_view.adapter = adapter
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

        }
    }
}
