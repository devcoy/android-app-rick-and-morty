package com.jc.rickandmortyapi.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jc.rickandmortyapi.databinding.ItemCharacterBinding
import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterNetworkModel
import com.jc.rickandmortyapi.domain.character.CharacterDto

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)

    fun render(character: CharacterDto) {
        binding.tvName.text = character.name
        binding.tvStatus.text = character.status
        binding.tvSpecie.text = character.specie
        Glide
            .with(binding.ivPhoto.context)
            .load(character.photo)
            .into(binding.ivPhoto)
    }
}