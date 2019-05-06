package com.framgia.retrofit2kotlin.data

import com.framgia.retrofit2kotlin.model.Employee
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface APIService {
    @GET("employees")
    fun getAllEmployee(): Call<List<Employee>>

    /**Okay, so what about the @FormUrlEncoded?
     *  This will indicate that the request will have its MIME type (a header field that identifies the format of
     *  the body of an HTTP request or response) set to application/x-www-form-urlencoded and also that its field names and values will be UTF-8 encoded before being URI-encoded.
     *  The @Field("key") annotation with parameter name should match the name that the API expects.
     *  Retrofit implicitly converts the values to strings using String.valueOf(Object), and the strings are then form URL encoded. null values are ignored. */

    @POST("create")
    @FormUrlEncoded
    fun createNewEmployee(
        @Field("id") id: String = "1000",
        @Field("name") name: String = "tai",
        @Field("salary") salary: String = "1000",
        @Field("age") age: String = "21"
    ): Call<Employee>

    @GET("/db")
    fun getDataBase(): Call<List<Post>>

    @POST("/posts")
    @FormUrlEncoded
    fun post(
        @Field("title") title: String,
        @Field("body") body: String,
        @Field("userId") userId: Long
    ): Call<Post>

}