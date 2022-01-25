package com.jc.rickandmortyapi.dataAccess.dummy

import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterNetworkModel

class CharacterProvider {

    companion object {
        val characters = listOf<CharacterNetworkModel>(
            CharacterNetworkModel("1", "Courier Flap", "Alive", "Alien", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            CharacterNetworkModel("2", "Gonorrhea", "Dead", "Disease", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            CharacterNetworkModel("3", "Hammerhead Morty", "Unknown", "Humanoid", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            CharacterNetworkModel("4", "Zarbadar's Mytholog", "Unknown", "Mythological Creature", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            CharacterNetworkModel("5", "Wicker Rick", "Dead", "Wicker Rick", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            CharacterNetworkModel("6", "Plutonian Hostess", "Alive", "Alien", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
        )
    }
}