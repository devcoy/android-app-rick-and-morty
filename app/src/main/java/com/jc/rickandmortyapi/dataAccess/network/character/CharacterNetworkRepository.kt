package com.jc.rickandmortyapi.dataAccess.network.character

import com.jc.rickandmortyapi.dataAccess.network.character.http.CharacterService
import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterNetworkModel
import com.jc.rickandmortyapi.domain.character.CharacterDto
import com.jc.rickandmortyapi.domain.character.toDomain
import javax.inject.Inject

class CharacterNetworkRepository @Inject constructor(private val http: CharacterService) {

    suspend fun getAllCharactersFromApi(): List<CharacterDto> {
        val response: List<CharacterNetworkModel> = http.findAllCharacter()
        return response.map { it.toDomain() }
    }
}