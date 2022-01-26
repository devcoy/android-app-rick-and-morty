package com.jc.rickandmortyapi.ui.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jc.rickandmortyapi.domain.character.usecases.GetAllCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(private val getAllCharacterUseCase: GetAllCharacterUseCase) :
    ViewModel() {

    private val TAG = "CharacterViewModel"
    val characterMLD = MutableLiveData<Any>()

    fun onCreate() {
        viewModelScope.launch {
            val characters = getAllCharacterUseCase().characters
            Log.i(TAG, "$characters")

            //characterMLD.postValue(characters)
            if (!characters.isNullOrEmpty()) {
                characterMLD.postValue(characters)
            }
        }
    }


}