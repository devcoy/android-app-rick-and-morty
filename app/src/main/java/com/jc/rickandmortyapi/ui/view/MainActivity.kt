package com.jc.rickandmortyapi.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.jc.rickandmortyapi.dataAccess.dummy.CharacterProvider
import com.jc.rickandmortyapi.databinding.ActivityMainBinding
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

        characterVM.characterMLD.observe(this, {
            binding.rvCharacter.adapter = CharacterAdapter(it)
        })
    }
}