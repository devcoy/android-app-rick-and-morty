package com.jc.rickandmortyapi.application.character

import com.jc.rickandmortyapi.dataAccess.network.character.CharacterNetworkRepository
import com.jc.rickandmortyapi.domain.character.CharacterDto
import com.jc.rickandmortyapi.domain.character.CharacterUseCase
import javax.inject.Inject

class CharacterComponent @Inject constructor(private val repositoryNetwork: CharacterNetworkRepository) :
    CharacterUseCase {
    override suspend fun findAllCharacters(): List<CharacterDto> {
        return repositoryNetwork.getAllCharactersFromApi()
    }
}