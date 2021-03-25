package com.example.cepdog.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cepdog.model.DogApi
import com.example.cepdog.model.DoggyResponse

class DogViewModel: ViewModel() {

    private val mutableLiveData = MutableLiveData<DoggyResponse>()

    fun getDogData(): LiveData<DoggyResponse> = mutableLiveData

    init{
//        viewModelScope.launch {
//            val response =
//                DogApi.getApi().getDogs()
//
//            mutableLiveData.value = response
//        }
    }
}