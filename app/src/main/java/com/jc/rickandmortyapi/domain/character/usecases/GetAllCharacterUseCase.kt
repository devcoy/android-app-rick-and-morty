package com.jc.rickandmortyapi.domain.character.usecases

import com.jc.rickandmortyapi.dataAccess.network.character.CharacterNetworkRepository
import com.jc.rickandmortyapi.domain.character.dto.CharacterDto
import javax.inject.Inject

class GetAllCharacterUseCase @Inject constructor(
    private val characterNetworkRepository: CharacterNetworkRepository
) {
    suspend operator fun invoke(): List<CharacterDto> {
        val characters = characterNetworkRepository.getAllCharactersFromApi()
        characters.let {
            if(characters!!.isNotEmpty()) {
                return characters
            }
        }
        return emptyList()
    }
}