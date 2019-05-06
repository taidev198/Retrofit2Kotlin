package com.framgia.retrofit2kotlin.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import com.google.gson.Gson


/**
 * Created by superme198 on 04,May,2019
 * in retrofit2_download_file-master.
 *
 */
object API {
    private var retrofit: Retrofit? = null
    private const val BASE_URL_MY_JSON: String = "https://my-json-server.typicode.com/demo/"
    private const val BASE_URL_DUMMY: String = "http://dummy.restapiexample.com/api/v1/"
    val apiService: APIService
        get() {
            val gson = GsonBuilder()
                .setLenient()
                .create()

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL_DUMMY)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit!!.create(APIService::class.java)
        }

}