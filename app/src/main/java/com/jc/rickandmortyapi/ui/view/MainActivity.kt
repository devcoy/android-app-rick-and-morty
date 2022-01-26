package com.jc.rickandmortyapi.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.jc.rickandmortyapi.dataAccess.network.character.model.CharacterModel
import com.jc.rickandmortyapi.databinding.ActivityMainBinding
import com.jc.rickandmortyapi.domain.character.dto.CharacterDto
import com.jc.rickandmortyapi.ui.adapter.CharacterAdapter
import com.jc.rickandmortyapi.ui.viewModel.CharacterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val characterVM: CharacterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRVCharacters()
    }

    private fun initRVCharacters() {

        val manager = LinearLayoutManager(this)
        binding.rvCharacter.layoutManager = manager
        characterVM.onCreate()

        characterVM.characterMLD.observe(this, Observer {
            binding.rvCharacter.adapter = CharacterAdapter(it as List<CharacterDto>)
        })
    }
}