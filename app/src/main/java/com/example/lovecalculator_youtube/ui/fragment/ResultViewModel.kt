package com.example.lovecalculator_youtube.ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lovecalculator_youtube.model.ResultResponse
import com.example.lovecalculator_youtube.repository.ResultRepository
import kotlinx.coroutines.launch

class ResultViewModel(
    val resultRepository: ResultRepository
) : ViewModel(){

    val resultLiveData = MutableLiveData<ResultResponse>()

    fun getResult(yourName:String,partnerName:String) = viewModelScope.launch {
        val response = resultRepository.getResult(yourName, partnerName)
        resultLiveData.postValue(response)
    }
}