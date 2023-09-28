package com.iesam.serializationtrainning.data

import com.google.gson.annotations.SerializedName
import java.util.Date

data class AlertsApiModel(@SerializedName("id") val id: String, @SerializedName("title") val title:String,@SerializedName("summary") val summary:String,@SerializedName("type") val type: String,@SerializedName("date") val date: String)
data class AlertApiModel(@SerializedName("id") val id: String,@SerializedName("plant_id") val plant_id:Int,@SerializedName("name") val name:String,@SerializedName("url_source") val urlSource: String,@SerializedName("url_imgae") val url_imagen: String,
    @SerializedName("causal_agent") val causal_agent: String, @SerializedName("body") val body:String,@SerializedName("imagesPlagues") val imagesPlagues: ImagesPlagues,@SerializedName("filesPlagues") val filesPlagues: FilesPlagues)

data class ImagesPlagues(@SerializedName("id") val id:String, @SerializedName("plague_id") val plague_id: String, @SerializedName("name") val name: String, @SerializedName("url") val url: String,@SerializedName("update_at") val update_at: String)
data class FilesPlagues(@SerializedName("id") val id: String, @SerializedName("plague_id") val plague_id: String, @SerializedName("name") val name: String, @SerializedName("url") val url: String,@SerializedName("update_at") val update_at: String)

data class PlagueApiModel(@SerializedName("id") val id: String, @SerializedName("name") val name:String, @SerializedName("url") val url: String, @SerializedName("update_at") val update_at: String)