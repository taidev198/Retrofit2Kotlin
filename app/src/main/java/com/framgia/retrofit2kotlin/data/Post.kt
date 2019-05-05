package com.framgia.retrofit2kotlin.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by superme198 on 04,May,2019
 * in retrofit2_download_file-master.
 *
 */
class Post {

    @SerializedName("id")
    @Expose
    private var id: String = ""
    @SerializedName("employee_name")
    @Expose
    private var employeeName: String = ""
    @SerializedName("employee_salary")
    @Expose
    private var employeeSalary: String = ""
    @SerializedName("employee_age")
    @Expose
    private var employeeAge: String = ""
    @SerializedName("profile_image")
    @Expose
    private var profileImage: String = ""

}