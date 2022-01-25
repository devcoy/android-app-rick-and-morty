package com.jc.rickandmortyapi.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jc.rickandmortyapi.R
import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterNetworkModel
import com.jc.rickandmortyapi.domain.character.CharacterDto

class CharacterAdapter(
    private val characters: List<CharacterDto>
) : RecyclerView.Adapter<CharacterViewHolder>() {

    override fun getItemCount(): Int = characters.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharacterViewHolder(layoutInflater.inflate(R.layout.item_character, parent, false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.render(character)
    }


}