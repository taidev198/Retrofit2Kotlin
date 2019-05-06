package com.framgia.retrofit2kotlin.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by superme198 on 04,May,2019
 * in retrofit2_download_file-master.
 *
 */
class Post {

    @SerializedName("title")
    @Expose
     var title: String? = null
    @SerializedName("body")
    @Expose
     var body: String? = null
    @SerializedName("userId")
    @Expose
     var userId: Int? = null
    @SerializedName("id")
    @Expose
     var id: Int? = null

}