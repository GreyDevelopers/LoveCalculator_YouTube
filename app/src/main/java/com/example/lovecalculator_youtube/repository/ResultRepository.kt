package com.example.lovecalculator_youtube.repository

import com.example.lovecalculator_youtube.network.RetrofitInstance

class ResultRepository {
    suspend fun getResult(yourName:String,partnerName:String) = RetrofitInstance.api.getResult(yourName, partnerName)
}