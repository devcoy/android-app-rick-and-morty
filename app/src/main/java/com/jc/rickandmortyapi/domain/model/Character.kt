package com.jc.rickandmortyapi.domain.model

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val specie: String
)
