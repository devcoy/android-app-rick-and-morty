package com.jc.rickandmortyapi.ui.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jc.rickandmortyapi.application.character.CharacterComponent
import com.jc.rickandmortyapi.domain.character.CharacterDto
import com.jc.rickandmortyapi.domain.character.CharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(private val characterUseCase: CharacterComponent) :
    ViewModel() {

    private val TAG = "CharacterViewModel"
    val characterMLD = MutableLiveData<List<CharacterDto>>()

    fun onCreate() {
        viewModelScope.launch {
            val characters = characterUseCase.findAllCharacters()
            Log.i(TAG, "$characters")

            if (!characters.isNullOrEmpty()) {
                characterMLD.postValue(characters)
            }
        }
    }


}