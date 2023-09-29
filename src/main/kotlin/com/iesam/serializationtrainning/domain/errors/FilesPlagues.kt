package com.iesam.serializationtrainning.domain.errors

import com.google.gson.annotations.SerializedName

data class FilesPlagues(@SerializedName("id") val id: String, @SerializedName("plague_id") val plague_id: String, @SerializedName("name") val name: String, @SerializedName("url") val url: String, @SerializedName("update_at") val update_at: String)
