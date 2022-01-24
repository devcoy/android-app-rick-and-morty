package com.jc.rickandmortyapi.data.dummy

import com.jc.rickandmortyapi.domain.model.Character

class CharacterProvider {

    companion object {
        val characters = listOf<Character>(
            Character("1", "Courier Flap", "Alive", "Alien"),
            Character("2", "Gonorrhea", "Dead", "Disease"),
            Character("3", "Hammerhead Morty", "Unknown", "Humanoid"),
            Character("4", "Zarbadar's Mytholog", "Unknown", "Mythological Creature"),
            Character("5", "Wicker Rick", "Dead", "Wicker Rick"),
            Character("6", "Plutonian Hostess", "Alive", "Alien"),
        )
    }
}