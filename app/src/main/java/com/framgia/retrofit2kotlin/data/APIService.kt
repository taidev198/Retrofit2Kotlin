package com.framgia.retrofit2kotlin.data

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("employees")
    fun getAllEmployee(): Call<List<ResponseBody>>
}