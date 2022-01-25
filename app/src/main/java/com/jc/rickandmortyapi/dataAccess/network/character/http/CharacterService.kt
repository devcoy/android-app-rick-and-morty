package com.jc.rickandmortyapi.dataAccess.network.character.http

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterNetworkModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharacterService @Inject constructor(private val apiClient: CharacterApiClient) {

    suspend fun findAllCharacter(): List<CharacterNetworkModel> {
        return withContext(Dispatchers.IO) {
            val response = apiClient.findAllCharacter()
            response.body() ?: emptyList()
        }
    }
}