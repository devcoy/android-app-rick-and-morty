package com.jc.rickandmortyapi.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.jc.rickandmortyapi.ui.fragment.CharacterDetailsFragment
import com.jc.rickandmortyapi.R
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
            binding.rvCharacter.adapter = CharacterAdapter(it as List<CharacterDto>) { character ->
                onCharacterSelected(character)
            }
        })
    }

    /**
     * Lambda function
     */
    private fun onCharacterSelected(character: CharacterDto) {
        //Toast.makeText(this, character.name, Toast.LENGTH_SHORT).show()
        //Log.i("Character", "$character")
        characterVM.setCharacterSelected(character)

        val fragment = CharacterDetailsFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.viewContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}
