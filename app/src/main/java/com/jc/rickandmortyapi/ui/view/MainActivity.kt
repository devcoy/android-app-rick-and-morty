package com.jc.rickandmortyapi.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jc.rickandmortyapi.R
import com.jc.rickandmortyapi.data.dummy.CharacterProvider
import com.jc.rickandmortyapi.databinding.ActivityMainBinding
import com.jc.rickandmortyapi.domain.model.Character
import com.jc.rickandmortyapi.ui.adapter.CharacterAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRVCharacters()
    }

    private fun initRVCharacters() {
        val manager = LinearLayoutManager(this)
        binding.rvCharacter.layoutManager = manager
        binding.rvCharacter.adapter = CharacterAdapter(CharacterProvider.characters)
    }
}