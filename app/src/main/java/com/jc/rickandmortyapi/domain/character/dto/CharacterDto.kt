package com.jc.rickandmortyapi.domain.character.dto

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterLocation
import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterModel
import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterOrigin

data class CharacterDto(
    val id: String,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: CharacterOrigin,
    val location: CharacterLocation,
    val photo: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

fun CharacterModel.toDomain() = CharacterDto(
    name,
    id,
    status,
    species,
    type,
    gender,
    origin,
    location,
    photo,
    episode,
    url,
    created
)