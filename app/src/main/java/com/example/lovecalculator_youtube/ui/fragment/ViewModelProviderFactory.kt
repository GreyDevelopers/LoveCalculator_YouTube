package com.example.lovecalculator_youtube.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lovecalculator_youtube.repository.ResultRepository

class ViewModelProviderFactory(
    val resultRepository: ResultRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  ResultViewModel(resultRepository) as T
    }
}