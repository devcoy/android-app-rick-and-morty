package com.jc.rickandmortyapi.dataAccess.network.character

import com.jc.rickandmortyapi.dataAccess.network.character.http.CharacterService
import com.jc.rickandmortyapi.domain.character.dto.CharacterDto
import com.jc.rickandmortyapi.domain.character.dto.toDomain
import javax.inject.Inject

class CharacterNetworkRepository @Inject constructor(private val characterService: CharacterService) {

    suspend fun getAllCharactersFromApi(): List<CharacterDto>? {
        val response = characterService.findAllCharacter()
        return response?.characters?.map { it.toDomain() }
    }
}