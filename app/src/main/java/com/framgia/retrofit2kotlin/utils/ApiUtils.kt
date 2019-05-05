package com.framgia.retrofit2kotlin.utils

import com.framgia.retrofit2kotlin.RetrofitClient
import com.framgia.retrofit2kotlin.data.APIService


/**
 * Created by superme198 on 04,May,2019
 *
 */
class ApiUtils {
    val BASE_URL = "http://dummy.restapiexample.com/api/v1/"

    fun getSOService(): APIService {
        return RetrofitClient.getClient(BASE_URL).create(APIService::class.java)
    }
}