package com.framgia.retrofit2kotlin.data

import com.framgia.retrofit2kotlin.model.Employee
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("employees")
    fun getAllEmployee(): Call<List<Employee>>
}