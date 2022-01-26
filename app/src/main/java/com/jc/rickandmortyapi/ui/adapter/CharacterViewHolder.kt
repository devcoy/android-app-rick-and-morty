package com.jc.rickandmortyapi.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jc.rickandmortyapi.databinding.ItemCharacterBinding
import com.jc.rickandmortyapi.domain.character.dto.CharacterDto

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)

    fun render(character: CharacterDto, onClickListener: (CharacterDto) -> Unit) {
        binding.tvName.text = character.name
        binding.tvStatus.text = character.status
        binding.tvSpecies.text = character.species
        Glide
            .with(binding.ivPhoto.context)
            .load(character.photo)
            .into(binding.ivPhoto)

        itemView.setOnClickListener {
            onClickListener(character)
        }
    }
}