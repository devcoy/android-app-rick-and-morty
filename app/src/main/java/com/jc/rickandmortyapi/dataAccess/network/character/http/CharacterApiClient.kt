package com.jc.rickandmortyapi.dataAccess.network.character.http

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApiClient {

    @GET("character")
    suspend fun findAllCharacter(): Response<CharacterApiResponse>
}