package com.example.lovecalculator_youtube.network

import com.example.lovecalculator_youtube.model.ResultResponse
import com.example.lovecalculator_youtube.util.Constants.Companion.API_KEY
import com.example.lovecalculator_youtube.util.Constants.Companion.HOST
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface API {

    @Headers("x-rapidapi-key: $API_KEY ", "x-rapidapi-host: $HOST ")
    @GET("getPercentage")
    suspend fun getResult(
        @Query("fname") yourName:String,
        @Query("sname") partnerName:String
    ):ResultResponse

}