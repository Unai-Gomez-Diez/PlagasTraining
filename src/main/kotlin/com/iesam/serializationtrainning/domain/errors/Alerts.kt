package com.iesam.serializationtrainning.domain.errors

import com.google.gson.annotations.SerializedName

data class Alerts (@SerializedName("id") val id: String,
              @SerializedName("title") val title:String,
              @SerializedName("summary") val summary:String,
              @SerializedName("type") val type: String,
              @SerializedName("date") val date: String)