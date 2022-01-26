package com.jc.rickandmortyapi.dataAccess.network.character.model

import com.google.gson.annotations.SerializedName
import com.jc.rickandmortyapi.dataAccess.network.common.InfoApiResponse

data class CharacterApiResponse(
    @SerializedName("info")
    val info: InfoApiResponse,
    @SerializedName("results")
    val characters: List<CharacterModel>
)
