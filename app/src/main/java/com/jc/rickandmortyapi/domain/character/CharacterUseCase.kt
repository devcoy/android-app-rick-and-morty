package com.jc.rickandmortyapi.domain.character

import javax.inject.Inject

interface CharacterUseCase {
    suspend fun findAllCharacters(): List<CharacterDto>
}