package com.jc.rickandmortyapi.domain.character

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterNetworkModel

data class CharacterDto(
    val id: String,
    val name: String,
    val status: String,
    val specie: String,
    val photo: String
)

fun CharacterNetworkModel.toDomain() = CharacterDto(id, name, status, specie, photo)