package com.framgia.retrofit2kotlin.model
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by superme198 on 04,May,2019
 * in NotesMVVM.
 *
 */
class Employee(var name: String) {

    @SerializedName("id")
    @Expose
     var id: String = ""
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("employee_name")
    @Expose
     var employeeName: String = ""
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("employee_salary")
    @Expose
     var employeeSalary: String = ""
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("employee_age")
    @Expose
     var employeeAge: String = ""
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("profile_image")
    @Expose
    private var profileImage: String = ""
        get() = field
        set(value) {
            field = value
        }


}