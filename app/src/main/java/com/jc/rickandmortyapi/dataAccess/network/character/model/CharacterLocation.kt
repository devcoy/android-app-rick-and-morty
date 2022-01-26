package com.jc.rickandmortyapi.dataAccess.network.character.model

import com.google.gson.annotations.SerializedName

data class CharacterLocation(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)