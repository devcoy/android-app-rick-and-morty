package com.jc.rickandmortyapi.ui.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jc.rickandmortyapi.domain.character.dto.CharacterDto
import com.jc.rickandmortyapi.domain.character.usecases.GetAllCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val getAllCharacterUseCase: GetAllCharacterUseCase
) :
    ViewModel() {
    val TAG = "CharacterViewModel"

    val characterMLD = MutableLiveData<Any>()
    private val characterSelectedMLD = MutableLiveData<CharacterDto>()

    fun onCreate() {
        Log.i(TAG, "onCreate")
        viewModelScope.launch {
            val characters = getAllCharacterUseCase()

            characterMLD.postValue(characters)
        }
    }

    fun setCharacterSelected(character: CharacterDto) {
        characterSelectedMLD.postValue(character)
    }

    fun getCharacterSelected(): LiveData<CharacterDto> {
        return characterSelectedMLD
    }


}