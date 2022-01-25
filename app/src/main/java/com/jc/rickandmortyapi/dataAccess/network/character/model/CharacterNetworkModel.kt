package com.jc.rickandmortyapi.dataAccess.network.character.model

import com.google.gson.annotations.SerializedName

data class CharacterNetworkModel(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val specie: String,
    @SerializedName("image")
    val photo: String
)
