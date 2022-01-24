package com.jc.rickandmortyapi.data.dummy

import com.jc.rickandmortyapi.domain.model.Character

class CharacterProvider {

    companion object {
        val characters = listOf<Character>(
            Character("1", "Courier Flap", "Alive", "Alien", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            Character("2", "Gonorrhea", "Dead", "Disease", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            Character("3", "Hammerhead Morty", "Unknown", "Humanoid", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            Character("4", "Zarbadar's Mytholog", "Unknown", "Mythological Creature", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            Character("5", "Wicker Rick", "Dead", "Wicker Rick", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
            Character("6", "Plutonian Hostess", "Alive", "Alien", "https://rickandmortyapi.com/api/character/avatar/75.jpeg"),
        )
    }
}