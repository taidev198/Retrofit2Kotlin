package com.framgia.retrofit2kotlin.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by superme198 on 04,May,2019
 * in retrofit2_download_file-master.
 *
 */
object API {
    private var retrofit: Retrofit? = null
    val apiService: APIService
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                        .baseUrl("http://dummy.restapiexample.com/api/v1/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit!!.create(APIService::class.java)
        }

}