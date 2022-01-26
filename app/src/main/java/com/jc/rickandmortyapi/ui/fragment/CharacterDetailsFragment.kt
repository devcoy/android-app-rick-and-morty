package com.jc.rickandmortyapi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.jc.rickandmortyapi.databinding.FragmentCharacterDetailsBinding
import com.jc.rickandmortyapi.ui.viewModel.CharacterViewModel

class CharacterDetailsFragment : Fragment() {

    private lateinit var binding: FragmentCharacterDetailsBinding

    private lateinit var characterVM: CharacterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        characterVM = ViewModelProvider(requireActivity()).get(CharacterViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCharacterDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFragment()
    }

    private fun initFragment() {
        characterVM.getCharacterSelected().observe(viewLifecycleOwner, {
            binding.tvName.text = it.name
            binding.tvId.text = it.id
            binding.tvStatus.text = it.status
            binding.tvSpecies.text = it.species
            binding.tvType.text = if (it.type.isNotEmpty()) it.type else "N.A"
            binding.tvGender.text = it.gender
            binding.tvOrigin.text = it.origin.name
            binding.tvLocation.text = it.location.name
            binding.tvCreated.text = it.created
            Glide
                .with(binding.ivPhoto.context)
                .load(it.photo)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(binding.ivPhoto)
        })
    }


}