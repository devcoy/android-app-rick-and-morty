package com.jc.rickandmortyapi.dataAccess.network.character.model

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("origin")
    val origin: CharacterOrigin,
    @SerializedName("location")
    val location: CharacterLocation,
    @SerializedName("image")
    val photo: String,
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("url")
    val url: String,
    @SerializedName("created")
    val created: String
)