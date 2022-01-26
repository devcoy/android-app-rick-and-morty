package com.jc.rickandmortyapi.domain.character.usecases

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterApiResponse
import com.jc.rickandmortyapi.dataAccess.network.character.CharacterNetworkRepository
import javax.inject.Inject

class GetAllCharacterUseCase @Inject constructor(private val characterNetworkRepository: CharacterNetworkRepository) {
    suspend operator fun invoke(): CharacterApiResponse {
        return characterNetworkRepository.getAllCharactersFromApi()!!
    }
}