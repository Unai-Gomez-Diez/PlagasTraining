package com.iesam.serializationtrainning.domain.errors

import com.google.gson.annotations.SerializedName
import com.iesam.serializationtrainning.data.FilesPlagues
import com.iesam.serializationtrainning.data.ImagesPlagues

class Alert (@SerializedName("id") val id: String, @SerializedName("plant_id") val plant_id:Int, @SerializedName("name") val name:String, @SerializedName("url_source") val urlSource: String, @SerializedName("url_imgae") val url_imagen: String,
             @SerializedName("causal_agent") val causal_agent: String, @SerializedName("body") val body:String, @SerializedName("imagesPlagues") val imagesPlagues: ImagesPlagues, @SerializedName("filesPlagues") val filesPlagues: FilesPlagues)