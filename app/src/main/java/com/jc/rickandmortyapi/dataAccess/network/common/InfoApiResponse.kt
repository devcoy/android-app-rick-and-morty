package com.jc.rickandmortyapi.dataAccess.network.common

import com.google.gson.annotations.SerializedName

data class InfoApiResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("page")
    val pages: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("prev")
    val prev: String
)