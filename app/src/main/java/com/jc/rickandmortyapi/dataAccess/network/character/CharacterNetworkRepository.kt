package com.jc.rickandmortyapi.dataAccess.network.character

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterApiResponse
import com.jc.rickandmortyapi.dataAccess.network.character.http.CharacterService
import javax.inject.Inject

class CharacterNetworkRepository @Inject constructor(private val characterService: CharacterService) {

    suspend fun getAllCharactersFromApi(): CharacterApiResponse? {
        return characterService.findAllCharacter()
    }
}