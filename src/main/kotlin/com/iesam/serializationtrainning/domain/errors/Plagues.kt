package com.iesam.serializationtrainning.domain.errors

import com.google.gson.annotations.SerializedName

data class Plagues (@SerializedName("id") val id: String,
                @SerializedName("name") val name:String,
                @SerializedName("url") val url: String,
                @SerializedName("update_at") val update_at: String)